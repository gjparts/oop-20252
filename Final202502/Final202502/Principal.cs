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
        }
    }
}
