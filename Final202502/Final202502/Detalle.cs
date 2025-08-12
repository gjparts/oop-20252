using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Final202502
{
    public partial class Detalle : Form
    {
        public Detalle()
        {
            InitializeComponent();
        }

        private void cancelar_Click(object sender, EventArgs e)
        {
            //cerrar este form; pero destruyendolo de la memoria
            this.Dispose();
        }

        private void aceptar_Click(object sender, EventArgs e)
        {
            //validar que venga llena la informacion obligatoria
            if (this.nombre.Text.Trim().Length == 0)
            {
                MessageBox.Show("Nombre no puede ir en blanco");
                return; //termina con el evento
            }
            if (this.codigo.Text.Trim().Length == 0)
            {
                MessageBox.Show("Codigo no puede ser vacio.");
                return; //termina con el evento
            }
            if (this.costo.Text.Trim().Length == 0 || this.precioVenta.Text.Trim().Length == 0 || this.existencias.Text.Trim().Length == 0)
            {
                MessageBox.Show("Costo, Precio de Venta o Existencias no pueden ser vacios.");
                return; //termina con el evento
            }

            try
            {
                //el costo o el precio de venta no pueden ser menores a cero
                if( Double.Parse(this.costo.Text) < 0 || Double.Parse(this.precioVenta.Text) < 0)
                {
                    MessageBox.Show("Costo o Precio de Venta no pueden ser negativos.");
                    return; //termina con el evento
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Debe colocar numeros en costo, precio de venta, existencisa");
            }

            //si llego hasta aqui todo salio bien, entonces solo ocultamos el Form sin destruirlo
            //para poder pasar sus datos al Formumario padre.
            this.Close();
        }
    }
}
