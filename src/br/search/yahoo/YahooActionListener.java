/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.search.yahoo;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "File",
        id = "br.search.yahoo.YahooActionListener")
@ActionRegistration(
        iconBase = "br/search/yahoo/yahoo-icon.png",
        displayName = "#CTL_YahooActionListener")
@ActionReference(path = "Toolbars/File", position = 300)
@Messages("CTL_YahooActionListener=Yahoo")
public final class YahooActionListener  extends AbstractAction implements Presenter.Toolbar {


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
    

    @Override
    public Component getToolbarPresenter() {
        return new YahooPanel();
    }
}
