import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.lang.Math.*;

public class Calculatorx extends JFrame implements ActionListener  {
   private static JTextField inputBox;
   int k = 1, x = 0, y = 0, z = 0;
	 double temp, temp1, result, a,b;
   char ch;

   Calculatorx(){}
   public static void main(String[] args) {
      createWindow();
   }

   private static void createWindow() {
      JFrame frame = new JFrame("Calculatorx");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      createUI(frame);
      frame.setSize(500,500);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   private static void createUI(JFrame frame) {
      JPanel panel = new JPanel();
      Calculatorx Calculatorx = new Calculatorx();
      GridBagLayout layout = new GridBagLayout();
      GridBagConstraints gbc = new GridBagConstraints();
      panel.setLayout(layout);
      inputBox = new JTextField(10);
      inputBox.setEditable(true);
      JButton button0 = new JButton("0");JButton button1 = new JButton("1");
      JButton button2 = new JButton("2");JButton button3 = new JButton("3");
      JButton button4 = new JButton("4");JButton button5 = new JButton("5");
      JButton button6 = new JButton("6");JButton button7 = new JButton("7");
      JButton button8 = new JButton("8");JButton button9 = new JButton("9");

      JButton buttonPlus = new JButton("+");JButton buttonMinus = new JButton("-");
      JButton buttonDivide = new JButton("/");JButton buttonMultiply = new JButton("x");
      JButton buttonClear = new JButton("C");JButton buttonDot = new JButton(".");
      JButton buttonEquals = new JButton("=");JButton buttonPower = new JButton("^");
      JButton buttonModulus = new JButton("%");JButton buttonSqrt = new JButton("v");
      JButton buttonLog = new JButton("log");JButton buttonSin = new JButton("sin");
      JButton buttonCos = new JButton("cos");JButton buttonTan = new JButton("tan");
      JButton buttonaddSub = new JButton("+/-");JButton buttonrec = new JButton("1/x");
      JButton buttonexp = new JButton("exp");JButton buttonfac = new JButton("n!");

      button1.addActionListener(Calculatorx);button2.addActionListener(Calculatorx);
      button3.addActionListener(Calculatorx);button4.addActionListener(Calculatorx);
      button5.addActionListener(Calculatorx);button6.addActionListener(Calculatorx);
      button7.addActionListener(Calculatorx);button8.addActionListener(Calculatorx);
      button9.addActionListener(Calculatorx);button0.addActionListener(Calculatorx);

      buttonPlus.addActionListener(Calculatorx);buttonMinus.addActionListener(Calculatorx);
      buttonDivide.addActionListener(Calculatorx);buttonMultiply.addActionListener(Calculatorx);
      buttonClear.addActionListener(Calculatorx);buttonDot.addActionListener(Calculatorx);
      buttonEquals.addActionListener(Calculatorx);buttonPower.addActionListener(Calculatorx);
      buttonModulus.addActionListener(Calculatorx);buttonSqrt.addActionListener(Calculatorx);
      buttonLog.addActionListener(Calculatorx);buttonSin.addActionListener(Calculatorx);
      buttonCos.addActionListener(Calculatorx);buttonTan.addActionListener(Calculatorx);
      buttonaddSub.addActionListener(Calculatorx);buttonrec.addActionListener(Calculatorx);
      buttonexp.addActionListener(Calculatorx);buttonfac.addActionListener(Calculatorx);

      gbc.fill = GridBagConstraints.BOTH;
      gbc.weightx = 1.0;gbc.weighty = 1.0;
      gbc.gridwidth = 5;
      gbc.gridx = 0; gbc.gridy = 0; panel.add(inputBox, gbc);
      gbc.gridwidth = 2;
      gbc.gridx = 3; gbc.gridy = 1; panel.add(buttonClear, gbc);
      gbc.gridwidth = 1;gbc.gridheight= 1;
      gbc.gridx = 0; gbc.gridy = 1; panel.add(buttonSqrt, gbc);
      gbc.gridx = 1; gbc.gridy = 1; panel.add(buttonLog, gbc);
      gbc.gridx = 2; gbc.gridy = 1; panel.add(buttonrec, gbc);
      gbc.gridx = 0; gbc.gridy = 2; panel.add(buttonSin, gbc);
      gbc.gridx = 1; gbc.gridy = 2; panel.add(buttonCos, gbc);
      gbc.gridx = 2; gbc.gridy = 2; panel.add(buttonTan, gbc);
      gbc.gridx = 3; gbc.gridy = 2; panel.add(buttonfac, gbc);
      gbc.gridx = 4; gbc.gridy = 2; panel.add(buttonexp, gbc);
      gbc.gridx = 0; gbc.gridy = 3; panel.add(button7, gbc);
      gbc.gridx = 1; gbc.gridy = 3; panel.add(button8, gbc);
      gbc.gridx = 2; gbc.gridy = 3; panel.add(button9, gbc);
      gbc.gridx = 3; gbc.gridy = 3; panel.add(buttonPlus, gbc);
      gbc.gridx = 4; gbc.gridy = 3; panel.add(buttonMinus, gbc);
      gbc.gridx = 0; gbc.gridy = 4; panel.add(button4, gbc);
      gbc.gridx = 1; gbc.gridy = 4; panel.add(button5, gbc);
      gbc.gridx = 2; gbc.gridy = 4; panel.add(button6, gbc);
      gbc.gridx = 3; gbc.gridy = 4; panel.add(buttonMultiply, gbc);
      gbc.gridx = 4; gbc.gridy = 4; panel.add(buttonDivide, gbc);
      gbc.gridx = 0; gbc.gridy = 5; panel.add(button1, gbc);
      gbc.gridx = 1; gbc.gridy = 5; panel.add(button2, gbc);
      gbc.gridx = 2; gbc.gridy = 5; panel.add(button3, gbc);
      gbc.gridx = 3; gbc.gridy = 5; panel.add(buttonModulus, gbc);
      gbc.gridx = 0; gbc.gridy = 6; panel.add(buttonDot, gbc);
      gbc.gridx = 1; gbc.gridy = 6; panel.add(button0, gbc);
      gbc.gridx = 2; gbc.gridy = 6; panel.add(buttonaddSub, gbc);
      gbc.gridx = 3; gbc.gridy = 6; panel.add(buttonPower, gbc);
      gbc.gridheight= 2;
      gbc.gridx = 4; gbc.gridy = 5; panel.add(buttonEquals, gbc);


      frame.getContentPane().add(panel);
      frame.setVisible(true);

   }

   public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("1")) {
			if (z == 0) {
				inputBox.setText(inputBox.getText() + "1");
			} else {
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + "1");
				z = 0;
			}
		}
		if (s.equals("2")) {
			if (z == 0) {
				inputBox.setText(inputBox.getText() + "2");
			} else {
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + "2");
				z = 0;
			}
		}
		if (s.equals("3")) {
			if (z == 0) {
				inputBox.setText(inputBox.getText() + "3");
			} else {
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + "3");
				z = 0;
			}
		}
		if (s.equals("4")) {
			if (z == 0) {
				inputBox.setText(inputBox.getText() + "4");
			} else {
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + "4");
				z = 0;
			}
		}
		if (s.equals("5")) {
			if (z == 0) {
				inputBox.setText(inputBox.getText() + "5");
			} else {
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + "5");
				z = 0;
			}
		}
		if (s.equals("6")) {
			if (z == 0) {
				inputBox.setText(inputBox.getText() + "6");
			} else {
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + "6");
				z = 0;
			}
		}
		if (s.equals("7")) {
			if (z == 0) {
				inputBox.setText(inputBox.getText() + "7");
			} else {
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + "7");
				z = 0;
			}
		}
		if (s.equals("8")) {
			if (z == 0) {
				inputBox.setText(inputBox.getText() + "8");
			} else {
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + "8");
				z = 0;
			}
		}
		if (s.equals("9")) {
			if (z == 0) {
				inputBox.setText(inputBox.getText() + "9");
			} else {
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + "9");
				z = 0;
			}
		}
		if (s.equals("0")) {
			if (z == 0) {
				inputBox.setText(inputBox.getText() + "0");
			} else {
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + "0");
				z = 0;
			}
		}
		if (s.equals("C")) {
			inputBox.setText("");
			x = 0;
			y = 0;
			z = 0;
		}
		if (s.equals("log")) {
			if (inputBox.getText().equals("")) {
				inputBox.setText("");
			} else {
				a = Math.log10(Double.parseDouble(inputBox.getText()));
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + a);
			}
		}


		if (s.equals(".")) {
			if (y == 0) {
				inputBox.setText(inputBox.getText() + ".");
				y = 1;
			} else {
				inputBox.setText(inputBox.getText());
			}
		}
		if (s.equals("+")) {
			if (inputBox.getText().equals("")) {
				inputBox.setText("");
				temp = 0;
				ch = '+';
			} else {
				temp = Double.parseDouble(inputBox.getText());
				inputBox.setText("");
				ch = '+';
				y = 0;
				x = 0;
			}
			inputBox.requestFocus();
		}
		if (s.equals("-")) {
			if (inputBox.getText().equals("")) {
				inputBox.setText("");
				temp = 0;
				ch = '-';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(inputBox.getText());
				inputBox.setText("");
				ch = '-';
			}
			inputBox.requestFocus();
		}
		if (s.equals("/")) {
			if (inputBox.getText().equals("")) {
				inputBox.setText("");
				temp = 1;
				ch = '/';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(inputBox.getText());
				ch = '/';
				inputBox.setText("");
			}
			inputBox.requestFocus();
		}
		if (s.equals("x")) {
			if (inputBox.getText().equals("")) {
				inputBox.setText("");
				temp = 1;
				ch = 'x';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(inputBox.getText());
				ch = 'x';
				inputBox.setText("");
			}
			inputBox.requestFocus();
		}

		if (s.equals("v")) {
			if (inputBox.getText().equals("")) {
				inputBox.setText("");
			} else {
				a = Math.sqrt(Double.parseDouble(inputBox.getText()));
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + a);
			}
		}
                if (s.equals("^")) {
			if (inputBox.getText().equals("")) {
				inputBox.setText("");
				temp = 1;
				ch = '^';
			} else {
				x = 0;
				y = 0;
				temp = Double.parseDouble(inputBox.getText());
				ch = '^';
				inputBox.setText("");
			}
			inputBox.requestFocus();
		}
                if (s.equals("1/x")) {
			if (inputBox.getText().equals("")) {
				inputBox.setText("");
			} else {
				a = 1 / Double.parseDouble(inputBox.getText());
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + a);
			}
		}
                if (s.equals("exp")) {
			if (inputBox.getText().equals("")) {
				inputBox.setText("");
			} else {
				a = Math.exp(Double.parseDouble(inputBox.getText()));
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + a);
			}
		}
                if (s.equals("+/-")) {
			if (x == 0) {
				inputBox.setText("-" + inputBox.getText());
				x = 1;
			} else {
				inputBox.setText(inputBox.getText());
			}
		}
                if (s.equals("n!")) {
			if (inputBox.getText().equals("")) {
				inputBox.setText("");
			} else {
				a = fact(Double.parseDouble(inputBox.getText()));
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + a);
			        }inputBox.requestFocus();
	        }
		if (s.equals("sin")) {
			if (inputBox.getText().equals("")) {
				inputBox.setText("");
			} else {
				a = Math.sin(Double.parseDouble(inputBox.getText()));
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + a);
			}
		}
		if (s.equals("cos")) {
			if (inputBox.getText().equals("")) {
				inputBox.setText("");
			} else {
				a = Math.cos(Double.parseDouble(inputBox.getText()));
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + a);
			}
		}
		if (s.equals("tan")) {
			if (inputBox.getText().equals("")) {
				inputBox.setText("");
			} else {
				a = Math.tan(Double.parseDouble(inputBox.getText()));
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + a);
			}
		}

		if (s.equals("=")) {
			if (inputBox.getText().equals("")) {
				inputBox.setText("");
			} else {
                                temp1 = Double.parseDouble(inputBox.getText());
				switch (ch) {
				case '+':
					result = temp + temp1;
					break;
				case '-':
					result = temp - temp1;
					break;
				case '/':
					result = temp / temp1;
					break;
				case 'x':
					result = temp * temp1;
					break;
                                case '^':
					result = Math.pow(temp,temp1);
					break;
				}
				inputBox.setText("");
				inputBox.setText(inputBox.getText() + result);
				z = 1;
			}
		}
      }
              double fact(double x) {
		int er = 0;
		if (x < 0) { er = 20;return 0;}
		double i, s = 1;
		for (i = 2; i <= x; i++)
			s *= i;
  		return s;
          	}

	}
