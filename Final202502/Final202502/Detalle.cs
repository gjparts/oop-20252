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
        }
    }
}
