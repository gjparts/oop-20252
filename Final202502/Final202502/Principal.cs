using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Final202502
{
    public partial class Principal : Form
    {
        //metodo para cargar los datos en el grid
        public void cargarDatos()
        {
            try
            {
                //crear objeto de conexion a la BD
                SqlConnection con = new SqlConnection(Properties.Resources.CadenaConexion);
                //crear la consulta en un String
                String sql = "SELECT ProductoID, Codigo, Nombre, Costo, PrecioVenta, Existencias, Comentarios FROM Producto";
                //crear un adaptador de datos que ejecutara la consulta por medio de la conexion
                SqlDataAdapter da = new SqlDataAdapter(sql, con);
                //el adaptador ocupa una tabla donde depositar los registros:
                DataTable dt = new DataTable();
                //ejecutar la consulta para llenar la tabla:
                da.Fill(dt);
                //llenar el grid con el contenido de la tabla:
                grid1.DataSource = dt;
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        public Principal()
        {
            InitializeComponent();
        }

        private void pruebaConexion_Click(object sender, EventArgs e)
        {
            //hacer una prueba de conexion a la BD
            try
            {
                //crear una conexion de prueba
                SqlConnection con = new SqlConnection(Properties.Resources.CadenaConexion);
                //abrir la conexion
                con.Open();
                //cerrar la conexion
                con.Close();
                //si llego aqui todo salio bien
                MessageBox.Show("Conexion Exitosa");
            }catch(Exception ex)
            {
                //Si falla la conexion mostrar que pasó
                MessageBox.Show(ex.Message);
            }
        }

        private void Principal_Load(object sender, EventArgs e)
        {
            cargarDatos();

            //personalizar nuestro grid
            //ocultar el selector de filas
            grid1.RowHeadersVisible = false;
            //evitar que se pueda agregar filas al grid
            grid1.ReadOnly = true;
            grid1.AllowUserToAddRows = false;
            grid1.AllowUserToDeleteRows = false;
            grid1.AllowUserToResizeRows = false;

            //colocar titulo a algunas columnas
            grid1.Columns["ProductoID"].HeaderText = "Numero de Item";
            grid1.Columns["PrecioVenta"].HeaderText = "Precio de Venta";

            //alineacion del texto de algunas columnas
            grid1.Columns["PrecioVenta"].DefaultCellStyle.Alignment = DataGridViewContentAlignment.MiddleRight;
            grid1.Columns["Costo"].DefaultCellStyle.Alignment = DataGridViewContentAlignment.MiddleRight;
            grid1.Columns["Existencias"].DefaultCellStyle.Alignment = DataGridViewContentAlignment.MiddleRight;

            grid1.SelectionMode = DataGridViewSelectionMode.FullRowSelect; //selecion de fila completa
        }

        private void botonAgregar_Click(object sender, EventArgs e)
        {
            //mandar a llamar un nuevo form Detalle
            Detalle d = new Detalle();
            d.ShowDialog();
            //este metodo se pausa hasta que cierre el Form de Detalle
            //se ha cerrado el Form Detalle, evaluamos que no si no fue destruido
            //entonces es porque hizo click en Aceptar
            if( d.IsDisposed == false)
            {
                //crear nuevo registro en la tabla de la base de datos
                String sql = "INSERT Producto(Codigo,Nombre,Costo,PrecioVenta,Existencias,Comentarios) VALUES(@1,@2,@3,@4,@5,@6)";

                try
                {
                    //crear objeto de conexion
                    SqlConnection con = new SqlConnection(Properties.Resources.CadenaConexion);
                    //crear objeto para ejecutar comandos en la base de datos
                    SqlCommand cmd = new SqlCommand(sql, con);
                    //rellenar los parametros respectivos
                    cmd.Parameters.AddWithValue("@1",d.codigo.Text);
                    cmd.Parameters.AddWithValue("@2", d.nombre.Text);
                    cmd.Parameters.AddWithValue("@3", d.costo.Text);
                    cmd.Parameters.AddWithValue("@4", d.precioVenta.Text);
                    cmd.Parameters.AddWithValue("@5", d.existencias.Text);
                    cmd.Parameters.AddWithValue("@6", d.comentarios.Text);
                    //ejecutar el comando
                    cmd.Connection.Open(); //abrir la conexion
                    cmd.ExecuteNonQuery(); //ejecucion
                    cmd.Connection.Close(); //cerrar la conexion
                    //volver a cargar los datos del grid
                    cargarDatos();
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
                //destruir el Detalle
                d.Dispose();
            }
        }

        private void botonEditar_Click(object sender, EventArgs e)
        {
            //asegurarse que hay filas en el grid
            if( grid1.Rows.Count == 0)
            {
                MessageBox.Show("Debe seleccionar un renglon");
                return;
            }
            //mandar a llamar la ventana de detalle
            Detalle d = new Detalle();
            //antes de mostrarla llenar sus cajas de texto con los valores de la fila seleccionada
            d.codigo.Text = grid1.CurrentRow.Cells["Codigo"].Value.ToString();
            d.nombre.Text = grid1.CurrentRow.Cells["Nombre"].Value.ToString();
            d.costo.Text = grid1.CurrentRow.Cells["Costo"].Value.ToString();
            d.precioVenta.Text = grid1.CurrentRow.Cells["PrecioVenta"].Value.ToString();
            d.existencias.Text = grid1.CurrentRow.Cells["Existencias"].Value.ToString();
            d.comentarios.Text = grid1.CurrentRow.Cells["Comentarios"].Value.ToString();
            //mostrar el detalle
            d.ShowDialog();

            //si Detalle no fue destruido es porque hizo click en Aceptar
            if( d.IsDisposed == false)
            {
                String sql = "UPDATE Producto SET Codigo = @1, Nombre = @2, Costo = @3, ";
                sql += "PrecioVenta = @4, Existencias = @5, Comentarios = @6 WHERE ProductoID = @7";
                try
                {
                    SqlConnection con = new SqlConnection(Properties.Resources.CadenaConexion);
                    SqlCommand cmd = new SqlCommand(sql, con);
                    cmd.Parameters.AddWithValue("@1",d.codigo.Text);
                    cmd.Parameters.AddWithValue("@2", d.nombre.Text);
                    cmd.Parameters.AddWithValue("@3", d.costo.Text);
                    cmd.Parameters.AddWithValue("@4", d.precioVenta.Text);
                    cmd.Parameters.AddWithValue("@5", d.existencias.Text);
                    cmd.Parameters.AddWithValue("@6", d.comentarios.Text);
                    cmd.Parameters.AddWithValue("@7", grid1.CurrentRow.Cells["ProductoID"].Value.ToString());
                    cmd.Connection.Open();
                    cmd.ExecuteNonQuery();
                    cmd.Connection.Close();
                    cargarDatos();
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
                //destruir el Detalle
                d.Dispose();
            }
        }

        private void botonEliminar_Click(object sender, EventArgs e)
        {
            //asegurarse que hay filas en el grid
            if (grid1.Rows.Count == 0)
            {
                MessageBox.Show("Debe seleccionar un renglon");
                return;
            }

            //preguntar al usuario si desea eliminar
            DialogResult opcion;
            opcion = MessageBox.Show("Desea eliminar el producto?", "Eliminar", MessageBoxButtons.YesNo);
            if( opcion == DialogResult.Yes)
            {
                String sql = "DELETE FROM Producto WHERE ProductoID = @1";
                try
                {
                    SqlConnection con = new SqlConnection(Properties.Resources.CadenaConexion);
                    SqlCommand cmd = new SqlCommand(sql, con);
                    cmd.Parameters.AddWithValue("@1", grid1.CurrentRow.Cells["ProductoID"].Value.ToString());
                    cmd.Connection.Open();
                    cmd.ExecuteNonQuery();
                    cmd.Connection.Close();
                    cargarDatos();
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
        }
    }
}
