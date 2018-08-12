package modelo;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMSolicitud implements TableModel{
    
    private List<Solicitud> lista;

    public TMSolicitud(List<Solicitud> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int index) {
        switch(index){
            case 0:
                return "Nombre producto";
            case 1:
                return "Marca";
            case 2:
                return "Nombre cliente";
            default:
                return "Fono";
        }
    }

    @Override
    public Class<?> getColumnClass(int column) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Solicitud sol = lista.get(row);
        
        switch (column) {
            case 0:
                return sol.getNombreProducto(); // ????? get o set?
            case 1:
                return sol.getMarcaProducto();
            case 2:
                return sol.getNombreCliente();
            default:
                return sol.getFono();
        }
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        //
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
        //
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        //
    }
    
}
