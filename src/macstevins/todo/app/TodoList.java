package macstevins.todo.app;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TodoList extends JFrame {

	public JPanel panelContentPane;
	public JPanel panelCenter;
	public JLabel appName;
	public JButton todoButton1;
	public JButton todoButton2;
	public JButton todoButton3;
	public JButton todoButton4;
	public JButton todoButton5;
	public JLabel todo1;
	public JLabel todo2;
	public JLabel todo3;
	public JLabel todo4;
	public JLabel todo5;
	public JTextField todoSet;
	public EventHandler eventHandler = new EventHandler();

	static final long serialVersionUID = -571974702623294366L;

	class EventHandler implements ActionListener {
	
		EventHandler() {}
	
		@Override
		public void actionPerformed(ActionEvent ae) {
			
			try {
				
				if(ae.getSource() == TodoList.this.getTodoButton1()) TodoList.this.actionConfirmDialog1(ae);
				if(ae.getSource() == TodoList.this.getTodoButton2()) TodoList.this.actionConfirmDialog2(ae);
				if(ae.getSource() == TodoList.this.getTodoButton3()) TodoList.this.actionConfirmDialog3(ae);
				if(ae.getSource() == TodoList.this.getTodoButton4()) TodoList.this.actionConfirmDialog4(ae);
				if(ae.getSource() == TodoList.this.getTodoButton5()) TodoList.this.actionConfirmDialog5(ae);
				if(ae.getSource() == TodoList.this.getTodoSet()) TodoList.this.actionEnter(ae);
			
			}
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
	
	}

	public TodoList() {
		
		try {
			
			save(new File("file.todo"));
			frame();
			initEvent();
			setTitle("To-do List");
			setSize(400, 300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			setLocationRelativeTo(null);
			setResizable(false);
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		
		}
	
	}

	public void frame() {
		
		try {
			
			List<String> lines = Files.readAllLines(Paths.get("file.todo"));
			setContentPane(getPanelContentPane());
			todo1.setText(lines.get(2));
			todo2.setText(lines.get(4));
			todo3.setText(lines.get(6));
			todo4.setText(lines.get(8));
			todo5.setText(lines.get(10));
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		
		}
	
	}

	public JPanel getPanelContentPane() {
		
		if(panelContentPane == null) {
			
			try {
				
				panelContentPane = new JPanel();
				panelContentPane.setLayout(new BorderLayout(5, 5));
				panelContentPane.add(getPanelCenter(), "Center");
			
			}
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
		return panelContentPane;
	
	}

	public JPanel getPanelCenter() {
		
		if(panelCenter == null) {
			
			try {
				
				panelCenter = new JPanel();
				panelCenter.setLayout(null);
				panelCenter.add(getAppName(), getAppName().getName());
				panelCenter.add(getTodoButton1(), getTodoButton1().getName());
				panelCenter.add(getTodo1(), getTodo1().getName());
				panelCenter.add(getTodoButton2(), getTodoButton2().getName());
				panelCenter.add(getTodo2(), getTodo2().getName());
				panelCenter.add(getTodoButton3(), getTodoButton3().getName());
				panelCenter.add(getTodo3(), getTodo3().getName());
				panelCenter.add(getTodoButton4(), getTodoButton4().getName());
				panelCenter.add(getTodo4(), getTodo4().getName());
				panelCenter.add(getTodoButton5(), getTodoButton5().getName());
				panelCenter.add(getTodo5(), getTodo5().getName());
				panelCenter.add(getTodoSet(), getTodoSet().getName());
				
			}
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
		return panelCenter;
	
	}

	public JLabel getAppName() {
		
		if(appName == null) {
			
			try {
				
				appName = new JLabel();
				appName.setText("To-do List");
				appName.setBounds(2, 10, 375, 42);
				appName.setHorizontalAlignment(0);
				appName.setFont(new Font("Dialog", 1, 20));
				appName.setPreferredSize(new Dimension(475, 42));
			
			}
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
		return appName;
	
	}

	public JButton getTodoButton1() {
		
		if(todoButton1 == null) {
			
			try {
				
				todoButton1 = new JButton();
				todoButton1.setText("Remove");
				todoButton1.setBounds(25, 55, 60, 25);
				todoButton1.setMargin(new Insets(2, 2, 2, 2));
				todoButton1.setPreferredSize(new Dimension(60, 25));
			
			}
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
		return todoButton1;
	
	}

	public JButton getTodoButton2() {
		
		if(todoButton2 == null) {
			
			try {
				
				todoButton2 = new JButton();
				todoButton2.setText("Remove");
				todoButton2.setBounds(25, 85, 60, 25);
				todoButton2.setMargin(new Insets(2, 2, 2, 2));
				todoButton2.setPreferredSize(new Dimension(60, 25));
			
			}
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
		return todoButton2;
	
	}

	public JButton getTodoButton3() {
		
		if(todoButton3 == null) {
			
			try {
				
				todoButton3 = new JButton();
				todoButton3.setText("Remove");
				todoButton3.setBounds(25, 115, 60, 25);
				todoButton3.setMargin(new Insets(2, 2, 2, 2));
				todoButton3.setPreferredSize(new Dimension(60, 25));
			
			}
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
		return todoButton3;
	
	}

	public JButton getTodoButton4() {
		
		if(todoButton4 == null) {
			
			try {
				
				todoButton4 = new JButton();
				todoButton4.setText("Remove");
				todoButton4.setBounds(25, 145, 60, 25);
				todoButton4.setMargin(new Insets(2, 2, 2, 2));
				todoButton4.setPreferredSize(new Dimension(60, 25));
			
			}
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
		return todoButton4;
	
	}

	public JButton getTodoButton5() {
		
		if(todoButton5 == null) {
			
			try {
				
				todoButton5 = new JButton();
				todoButton5.setText("Remove");
				todoButton5.setBounds(25, 175, 60, 25);
				todoButton5.setMargin(new Insets(2, 2, 2, 2));
				todoButton5.setPreferredSize(new Dimension(60, 25));
			
			}
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
		return todoButton5;
	
	}

	public JLabel getTodo1() {
		
		if(todo1 == null) {
			
			try {
				
				todo1 = new JLabel();
				todo1.setText("");
				todo1.setBounds(95, 57, 200, 20);
				todo1.setFont(new Font("Dialog", 0, 15));
				todo1.setPreferredSize(new Dimension(200, 20));
			
			}
			
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
		return todo1;
	
	}

	public JLabel getTodo2() {
		
		if(todo2 == null) {
			
			try {
				
				todo2 = new JLabel();
				todo2.setText("");
				todo2.setBounds(95, 86, 200, 20);
				todo2.setFont(new Font("Dialog", 0, 15));
				todo2.setPreferredSize(new Dimension(200, 20));
			
			}
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
		return todo2;
	
	}

	public JLabel getTodo3() {
		
		if(todo3 == null) {
			
			try {
				
				todo3 = new JLabel();
				todo3.setText("");
				todo3.setBounds(95, 116, 200, 20);
				todo3.setFont(new Font("Dialog", 0, 15));
				todo3.setPreferredSize(new Dimension(200, 20));
			
			}
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
		return todo3;
	
	}

	public JLabel getTodo4() {
		
		if(todo4 == null) {
			
			try {
				
				todo4 = new JLabel();
				todo4.setText("");
				todo4.setBounds(95, 146, 200, 20);
				todo4.setFont(new Font("Dialog", 0, 15));
				todo4.setPreferredSize(new Dimension(200, 20));
			
			}
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
		return todo4;
	
	}

	public JLabel getTodo5() {
		
		if(todo5 == null) {
			
			try {
				
				todo5 = new JLabel();
				todo5.setText("");
				todo5.setBounds(95, 176, 200, 20);
				todo5.setFont(new Font("Dialog", 0, 15));
				todo5.setPreferredSize(new Dimension(200, 20));
			
			}
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
		return todo5;
	
	}

	public JTextField getTodoSet() {
		
		if(todoSet == null) {
			
			try {
				
				todoSet = new JTextField();
				todoSet.setText("");
				todoSet.setBounds(25, 215, 345, 20);
				todoSet.setPreferredSize(new Dimension(345, 20));
			
			}
			catch(Exception e) {
				
				e.printStackTrace();
			
			}
		
		}
		return todoSet;
	
	}

	public void initEvent() throws Exception {
		
		try {
			
			getTodoButton1().addActionListener(eventHandler);
			getTodoButton2().addActionListener(eventHandler);
			getTodoButton3().addActionListener(eventHandler);
			getTodoButton4().addActionListener(eventHandler);
			getTodoButton5().addActionListener(eventHandler);
			getTodoSet().addActionListener(eventHandler);
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		
		}
	
	}

	public File save(File file) {
		
		try {
			
			if(!file.exists()) {
				
				file.createNewFile();
				FileWriter fw = new FileWriter(file);
				BufferedWriter writer = new BufferedWriter(fw);
				write(writer);
				writer.close();
				fw.close();
				try(BufferedReader reader = new BufferedReader(new FileReader(new File("file.todo")))) {
					
					String sl;
					while((sl = reader.readLine()) != null) System.out.println(sl);
				
				}
				catch(Exception e) {
					
					e.printStackTrace();
				
				}
			
			}
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		
		}
		return file;
	
	}

	public File rewrite(File file) {
		
		try {
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fw);
			write(writer);
			writer.close();
			fw.close();
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		
		}
		return file;
	
	}

	public void write(BufferedWriter writer) {
		
		try {
			
			writer.write("--------------------------------------------------");
			writer.newLine();
			writer.write("1.");
			writer.newLine();
			writer.write(getTodo1().getText());
			writer.newLine();
			writer.write("2.");
			writer.newLine();
			writer.write(getTodo2().getText());
			writer.newLine();
			writer.write("3.");
			writer.newLine();
			writer.write(getTodo3().getText());
			writer.newLine();
			writer.write("4.");
			writer.newLine();
			writer.write(getTodo4().getText());
			writer.newLine();
			writer.write("5.");
			writer.newLine();
			writer.write(getTodo5().getText());
			writer.newLine();
			writer.write("--------------------------------------------------");
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		
		}
	
	}

	public void actionConfirmDialog1(ActionEvent ae) {
		
		try {
			
			if(!todo1.getText().isEmpty()) {
				
				int optionPane = JOptionPane.showConfirmDialog(null, "Are You Sure", "Note", JOptionPane.YES_NO_OPTION);
				if(optionPane == JOptionPane.YES_OPTION) {
					
					todo1.setText("");
					rewrite(new File("file.todo"));
				
				}
			
			}
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		
		}
	
	}

	public void actionConfirmDialog2(ActionEvent ae) {
		
		try {
			
			if(!todo2.getText().isEmpty()) {
				
				int optionPane = JOptionPane.showConfirmDialog(null, "Are You Sure", "Note", JOptionPane.YES_NO_OPTION);
				if(optionPane == JOptionPane.YES_OPTION) {
					
					todo2.setText("");
					rewrite(new File("file.todo"));
				
				}
			
			}
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		
		}
	
	}

	public void actionConfirmDialog3(ActionEvent ae) {
		
		try {
			
			if(!todo3.getText().isEmpty()) {
				
				int optionPane = JOptionPane.showConfirmDialog(null, "Are You Sure", "Note", JOptionPane.YES_NO_OPTION);
				if(optionPane == JOptionPane.YES_OPTION) {
					
					todo3.setText("");
					rewrite(new File("file.todo"));
				
				}
			
			}
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		
		}
	
	}

	public void actionConfirmDialog4(ActionEvent ae) {
		
		try {
			
			if(!todo4.getText().isEmpty()) {
				
				int optionPane = JOptionPane.showConfirmDialog(null, "Are You Sure", "Note", JOptionPane.YES_NO_OPTION);
				if(optionPane == JOptionPane.YES_OPTION) {
					
					todo4.setText("");
					rewrite(new File("file.todo"));
				
				}
			
			}
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		
		}
	
	}

	public void actionConfirmDialog5(ActionEvent ae) {
		
		try {
			
			if(!todo5.getText().isEmpty()) {
				
				int optionPane = JOptionPane.showConfirmDialog(null, "Are You Sure", "Note", JOptionPane.YES_NO_OPTION);
				if(optionPane == JOptionPane.YES_OPTION) {
					
					todo5.setText("");
					rewrite(new File("file.todo"));
				
				}
			
			}
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		
		}
	
	}

	public void actionEnter(ActionEvent ae) {
		
		try {
			
			if(todo1.getText().isEmpty()) {
				
				todo1.setText(todoSet.getText());
				todoSet.setText("");
				rewrite(new File("file.todo"));
			
			}
			else if(todo2.getText().isEmpty()) {
				
				todo2.setText(todoSet.getText());
				todoSet.setText("");
				rewrite(new File("file.todo"));
			
			}
			else if(todo3.getText().isEmpty()) {
				
				todo3.setText(todoSet.getText());
				todoSet.setText("");
				rewrite(new File("file.todo"));
			
			}
			else if(todo4.getText().isEmpty()) {
				
				todo4.setText(todoSet.getText());
				todoSet.setText("");
				rewrite(new File("file.todo"));
			
			}
			else if(todo5.getText().isEmpty()) {
				
				todo5.setText(todoSet.getText());
				todoSet.setText("");
				rewrite(new File("file.todo"));
			
			}
			else {
				
				JOptionPane.showMessageDialog(null, "Todo List Is Full!!");
				todoSet.setText("");
			
			}
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		
		}
	
	}

}
