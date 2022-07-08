
package io.github.com.nbcf.micro_projeto_gerador_parcelas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
 /**
 *
* @author NILDO BUENO CORREIA FILHO 
 * NB- DESENVOLVIMENTO DE SISTEMAS
 * EMAIL: nil_bueno@hotmail.com
 * 
 * Created on 03/05/2011, 03:20:27
 */
public class EstiloVisual {
    
     public void EstiloLookandfeel(JFrame nomeFrame) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(nomeFrame);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Estilo não pode ser carregado",
                    "Aviso de Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
