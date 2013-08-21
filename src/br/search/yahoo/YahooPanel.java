/**
 * @Author:marcosptf@yahoo.com.br
 * @site:javascripterninja.com.br
 * @since:22/05/2013
 * Yahoo! Search Developer
 */

package br.search.yahoo;

//import java.awt.Container;

import java.net.URL;
import java.net.URLEncoder;
import org.openide.awt.HtmlBrowser;


/**
 *
 * @author marcosptfNetbeans
 */
public class YahooPanel extends javax.swing.JPanel {

    private javax.swing.JLabel      jLabelYahoo;
    private javax.swing.JTextField  jTextFieldYahoo;    
    private javax.swing.JComboBox   jComboBoxYahoo;
    private String                  strUrl            = "http://br.search.yahoo.com/search?p=";
    private String                  strLabelValue     = "Pesquisa Y!Search";
    private String                  strTextFieldValue = "Digite o termo de busca...";
    
    /**
     * Creates new form YahooPainel
     */
    public YahooPanel() {
        initComponent();
    }


    private void initComponent(){
        jLabelYahoo     = new javax.swing.JLabel();
        jTextFieldYahoo = new javax.swing.JTextField();
        jComboBoxYahoo  = new javax.swing.JComboBox();
        
//        org.openide.awt.Mnemonics.setLocalizedText(jLabelYahoo,org.openide.util.NbBundle.getMessage(YahooPainel.class, "YahooPainel.jLabelYahoo.text")); // NOI18N
        jLabelYahoo.setName("jLabelYahoo"); // NOI18N
        jLabelYahoo.setText("Y! Search");
        jTextFieldYahoo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                jTextFieldYahooActionPerformed(evt);
            }
            
            
        });        

        jComboBoxYahoo.setName("jComboBoxYahoo");
        jComboBoxYahoo.setModel(
                new javax.swing.DefaultComboBoxModel(
                    new String[] {
                        "Yahoo!",
                        "Y! Developer",
                        "Y! Respostas",
                        "PHP",
                        "Zend",
                        "JQuery",
                        "MySqlDev",
                        "Stack Overflow",
                        "GUJ",
                        "Google",
                        "W3 Schools",
                        "GitHub"
                    }
                )
         );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,true)
                .addGroup(
                layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelYahoo, javax.swing.GroupLayout.PREFERRED_SIZE,64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,16, Short.MAX_VALUE)
                .addComponent(jTextFieldYahoo, javax.swing.GroupLayout.PREFERRED_SIZE,200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBoxYahoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addComponent(jComboBoxYahoo,20,20,40)
                .addContainerGap()
                )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,true)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldYahoo,15,25,25)
                .addComponent(jLabelYahoo)
                .addComponent(jComboBoxYahoo,15,25,javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );        

     }


    
    
    private void jTextFieldYahooActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            String   searchText   = URLEncoder.encode(jTextFieldYahoo.getText(), "UTF-8");
            Integer  optionSearch = jComboBoxYahoo.getSelectedIndex();

            if(optionSearch.equals(1)){
                strUrl="http://developer.yahoo.com/find/?ei=UTF-8&vs=developer.yahoo.com%2Cdeveloper.yahoo.net&q="+searchText;
                
            }else if(optionSearch.equals(2)){
                strUrl="http://br.answers.yahoo.com/search/search_result;_ylt=AtkoXG8SnkKsbqpz5bfVQCjHwIlQ;_ylv=3?submit-go=Buscar+no+Yahoo%21+Respostas&p="+searchText;
                
            }else if(optionSearch.equals(3)){
                strUrl="http://br2.php.net/manual-lookup.php?lang=pt_BR&scope=quickref&pattern="+searchText;
                
            }else if(optionSearch.equals(4)){
                strUrl="http://br.search.yahoo.com/search;_ylt=A0geu8QdeoxRCwkAsmzz6Qt.?p="+searchText+"%20site%3Aframework.zend.com";
                
            }else if(optionSearch.equals(5)){
                strUrl="http://api.jquery.com/?s="+searchText;
                
            }else if(optionSearch.equals(6)){
                strUrl="http://search.oracle.com/search/search?group=MySQL&x=0&y=0&q="+searchText;
                
            }else if(optionSearch.equals(7)){
                strUrl="http://stackoverflow.com/search?q="+searchText;
                
            }else if(optionSearch.equals(8)){
                strUrl="http://br.search.yahoo.com/search;_ylt=A0geu8QdeoxRCwkAsmzz6Qt.?p="+searchText+"%20site%3Aguj.com.br";
                
            }else if(optionSearch.equals(9)){
//                strUrl="https://www.google.com.br/#output=search&sclient=psy-ab&q="+searchText+"&oq="+searchText+"&gs_l=hp.3...0.0.0.9249.0.0.0.0.0.0.0.0..0.0...0.0.0..1c..17.psy-ab.gvywAe0B28E&pbx=1&bav=on.2,or.r_cp.r_qf.&bvm=bv.48705608,d.aWM&fp=9d3f0e5d6c4de02f&biw=1920&bih=933";
                strUrl="http://www.google.com.br/search?q="+searchText;
                
            }else if(optionSearch.equals(10)){
                strUrl="http://br.search.yahoo.com/search;_ylt=A0geu8QdeoxRCwkAsmzz6Qt.?p="+searchText+"%20site%3Aw3schools.com";
                
                
            }else if(optionSearch.equals(11)){
                strUrl="https://github.com/search?q="+searchText;
                
            }else{
                strUrl="http://br.search.yahoo.com/search;_ylt=A0geu8QdeoxRCwkAsmzz6Qt.?p="+searchText;
            }
            
            HtmlBrowser.URLDisplayer.getDefault().showURL(
                        new URL(strUrl)
                    );
        } catch (Exception err){
            err.getMessage();//nothing much to do
        }

    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
