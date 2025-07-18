import java.awt.event.*;

import javax.swing.*;

public class slip23b extends JFrame implements ActionListener

{
	public static void main(String args[])
	{
		new slip23b();
	}
		public slip23b()
	{
		this.setSize(400,400);
		this.setLocation(200,200);

		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu();

		JMenu fileEdit = new JMenu();

		JMenu fileSearch = new JMenu();

		JMenuItem OpenItem = new JMenuItem("Open");

		
		JMenuItem SaveItem = new JMenuItem("Save");

		
		JMenuItem ExitItem = new JMenuItem("Exit");

		
		JMenuItem UndoItem = new JMenuItem("Undo");

		
		JMenuItem RedoItem = new JMenuItem("Redo");

	
		JMenuItem CutItem = new JMenuItem("Cut");

		
		JMenuItem CopyItem = new JMenuItem("Copy");

		
		JMenuItem PasteItem = new JMenuItem("Paste");

		ImageIcon OpenIcon = new ImageIcon("icons/open.png");

		fileMenu.add(OpenItem);

		fileMenu.add(SaveItem);

		fileMenu.add(ExitItem);

		fileEdit.add(UndoItem);

		fileEdit.add(RedoItem);

		fileEdit.add(CutItem);

		fileEdit.add(CopyItem);

		fileEdit.add(PasteItem);

		OpenItem.setIcon(OpenIcon);

		SaveItem.setIcon(OpenIcon);

		ExitItem.setIcon(OpenIcon);

		UndoItem.setIcon(OpenIcon);

		RedoItem.setIcon(OpenIcon);

		CutItem.setIcon(OpenIcon);
		
		CopyItem.setIcon(OpenIcon);

		PasteItem.setIcon(OpenIcon);

		menuBar.add(fileMenu);

		menuBar.add(fileEdit);
	
		
		menuBar.add(fileSearch);

		this.setJMenuBar(menuBar);

		this.setVisible(true);


	}

		public void actionPerformed(ActionEvent ae)

		{
			
		}
}