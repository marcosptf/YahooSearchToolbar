/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.search.yahoo;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "File",
        id = "org.myorg.yahootoolbar.YahooActionListener")
@ActionRegistration(
        lazy = false,
        displayName = "NOT-USED")
@ActionReference(
        path = "Toolbars/File",
        position = 0)

public final class YahooActionListener extends AbstractAction implements Presenter.Toolbar {

    @Override
    public Component getToolbarPresenter() {
        // TODO implement action body
        return new YahooPainel();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
