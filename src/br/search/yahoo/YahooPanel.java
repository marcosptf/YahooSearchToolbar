/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.search.yahoo;

import java.net.URL;
import java.net.URLEncoder;
import org.openide.awt.HtmlBrowser.URLDisplayer;

/**
 *
 * @author marcosptfNetbeans
 */
public class YahooPanel extends javax.swing.JPanel {

    private String strUrl            = "http://br.search.yahoo.com/search?p=";
    private String strLabelValue     = "Pesquisa Y!Search";
    private String strTextFieldValue = "Digite o termo de busca...";
    
    /**
     * Creates new form YahooPanel
     */
    public YahooPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1     = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1  = new javax.swing.JComboBox();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(YahooPanel.class, "YahooPanel.jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1");
        jLabel1.setText(this.strLabelValue);
        jLabel1.setToolTipText(this.strLabelValue);

        jTextField1.setName("jTextField1");
        jTextField1.setText(org.openide.util.NbBundle.getMessage(YahooPanel.class, "YahooPanel.jTextField1.text")); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
                jTextField1ActionPerformed(evt);
            }
        });
        
        jComboBox1.setName("jComboBox1");
        jComboBox1.setModel(
                new javax.swing.DefaultComboBoxModel(
                    new String[] {
                        "Yahoo!",
                        "YDN!",
                        "YR!", 
                        "PHP",
                        "Zend",
                        "JQuery",
                        "MySql",
                        "SO",
                        "GUJ"
                    }
                )
         );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>                        
    // Variables declaration - do not modify                     
    private javax.swing.JComboBox  jComboBox1;
    private javax.swing.JLabel     jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            String   searchText   = URLEncoder.encode(jTextField1.getText(), "UTF-8");
            String   optionSearch = jComboBox1.getSelectedObjects().toString();

            if(optionSearch.contentEquals("YDN!")){
                strUrl="http://developer.yahoo.com/find/?ei=UTF-8&vs=developer.yahoo.com%2Cdeveloper.yahoo.net&q=";
                
            }else if(optionSearch.contentEquals("YR!")){
                strUrl="http://br.answers.yahoo.com/search/search_result;_ylt=AtkoXG8SnkKsbqpz5bfVQCjHwIlQ;_ylv=3?submit-go=Buscar+no+Yahoo%21+Respostas&p=";
                
            }else if(optionSearch.contentEquals("PHP")){
                strUrl="http://br.search.yahoo.com/search;_ylt=A0geu8QdeoxRCwkAsmzz6Qt.?%20site%3Aphp.net&fr2=sb-top&fr=sfp&rd=r1&p=";
                
            }else if(optionSearch.contentEquals("Zend")){
                strUrl="http://br.search.yahoo.com/search;_ylt=A0geu8QdeoxRCwkAsmzz6Qt.?site%3Aframework.zend.com&fr2=sb-top&fr=sfp&rd=r1&p=";
                
            }else if(optionSearch.contentEquals("JQuery")){
                strUrl="http://br.search.yahoo.com/search;_ylt=A0geu8QdeoxRCwkAsmzz6Qt.?%20site%3Ajquery.com&fr2=sb-top&fr=sfp&rd=r1&p=";
                
            }else if(optionSearch.contentEquals("MySql")){
                strUrl="http://br.search.yahoo.com/search;_ylt=A0geu8QdeoxRCwkAsmzz6Qt.?%20site%3Adev.mysql.com&fr2=sb-top&fr=sfp&rd=r1&p=";
                
            }else if(optionSearch.contentEquals("SO")){
                strUrl="http://br.search.yahoo.com/search;_ylt=A0geu8QdeoxRCwkAsmzz6Qt.?%20site%3Astackoverflow.com&fr2=sb-top&fr=sfp&rd=r1&p=";
                
            }else if(optionSearch.contentEquals("GUJ")){
                strUrl="http://br.search.yahoo.com/search;_ylt=A0geu8QdeoxRCwkAsmzz6Qt.?%20site%3Aguj.com.br&fr2=sb-top&fr=sfp&rd=r1&p=";
                
            }
            
            URLDisplayer.getDefault().showURL
               (new URL(strUrl+searchText));
        } catch (Exception err){
            err.getMessage();//nothing much to do
        }

    }
}




