import java.awt.*;
import java.util.Arrays;
import javax.swing.*;

public class Main {
    // Definición de colores
    public static final int COLOR_YELLOW = new Color(250, 201, 20).getRGB();
    public static final int COLOR_BLUE = new Color(17, 15, 99).getRGB();
    public static final int COLOR_RED = new Color(196, 0, 15).getRGB();
    public static final int COLOR_BLACK = new Color(5, 5, 5).getRGB();
    public static final int COLOR_WHITE = new Color(255, 255, 255).getRGB();
    public static final int COLOR_GREEN = new Color(35, 138, 51).getRGB();

    // Función para crear la bandera de Colombia
    public static int[][] createCOLFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowEnd = 0;

        // Colorear la parte superior de la bandera de amarillo
        rowEnd = (int) (height * 0.50);
        for (int row = rowInt; row < rowEnd; row++) {
            Arrays.fill(flag[row], COLOR_YELLOW);
        }

        // Colorear la parte del medio de la bandera de azul
        rowInt = (int) (height * 0.50);
        rowEnd = (int) (height * 0.75);
        for (int row = rowInt; row < rowEnd; row++) {
            Arrays.fill(flag[row], COLOR_BLUE);
        }

        // Colorear la parte inferior de la bandera de rojo
        rowInt = (int) (height * 0.75);
        rowEnd = height;
        for (int row = rowInt; row < rowEnd; row++) {
            Arrays.fill(flag[row], COLOR_RED);
        }
        return flag;
    }

    // Función para crear la bandera de Venezuela
    public static int[][] createVENFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowEnd = 0;

        // Colorear la parte superior de la bandera de amarillo
        rowEnd = (int) (height * 0.33);
        for (int row = rowInt; row < rowEnd; row++) {
            Arrays.fill(flag[row], COLOR_YELLOW);
        }

        // Colorear la parte del medio de la bandera de azul
        rowInt = (int) (height * 0.33);
        rowEnd = (int) (height * 0.66);
        for (int row = rowInt; row < rowEnd; row++) {
            Arrays.fill(flag[row], COLOR_BLUE);
        }

        // Colorear la parte inferior de la bandera de rojo
        rowInt = (int) (height * 0.66);
        rowEnd = (int) (height * 0.99);
        for (int row = rowInt; row < rowEnd; row++) {
            Arrays.fill(flag[row], COLOR_RED);
        }
        return flag;
    }

    // Función para crear la bandera de Polonia
    public static int[][] createPOLFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowEnd = 0;

        // Colorear la parte superior de la bandera de blanco
        rowEnd = (int) (height * 0.50);
        for (int row = rowInt; row < rowEnd; row++) {
            Arrays.fill(flag[row], COLOR_WHITE);
        }

        // Colorear la parte inferior de la bandera de rojo
        rowInt = (int) (height * 0.50);
        rowEnd = height;
        for (int row = rowInt; row < rowEnd; row++) {
            Arrays.fill(flag[row], COLOR_RED);
        }
        return flag;
    }

    // Función para crear la bandera de Panamá
    public static int[][] createPANFlag(int height, int width) {
        int[][] flag = new int[height][width];

        // Colorear la parte superior izquierda de blanco
        int rowEnd = (int) (height * 0.50);
        int columnEnd = (int) (width * 0.50);
        for (int row = 0; row < rowEnd; row++) {
            Arrays.fill(flag[row], 0, columnEnd, COLOR_WHITE);
        }

        // Colorear la parte superior derecha de rojo
        for (int row = 0; row < rowEnd; row++) {
            Arrays.fill(flag[row], columnEnd, width, COLOR_RED);
        }

        // Colorear la parte inferior izquierda de azul
        int rowStart = rowEnd;
        for (int row = rowStart; row < height; row++) {
            Arrays.fill(flag[row], 0, columnEnd, COLOR_BLUE);
        }

        // Colorear la parte inferior derecha de blanco
        for (int row = rowStart; row < height; row++) {
            Arrays.fill(flag[row], columnEnd, width, COLOR_WHITE);
        }

        return flag;
    }

    // Función para crear la bandera de Sudáfrica (ZAF)
    public static int[][] createZAFFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowEnd = 0;
        int cellInt = 0;
        int cellEnd = 0;

        // COLOR RED
        rowInt = 0;
        rowEnd = (int) (height * 0.35);
        cellInt = 0;
        cellEnd = width;

        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        // COLOR WHITE
        rowInt = rowEnd;
        rowEnd = (int) (height * 0.7);
        cellInt = 0;
        cellEnd = width;

        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        // COLOR BLUE
        rowInt = rowEnd;
        rowEnd = height;
        cellInt = 0;
        cellEnd = width;

        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        // COLOR WHITE >
        rowInt = 0;
        rowEnd = (int) (height * 0.5);
        cellInt = 0;
        cellEnd = 1;

        for (int row = rowInt; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
                flag[height - 1 - row][cell] = COLOR_WHITE;
            }
        }

        // COLOR GREEN >
        rowInt = 0;
        rowEnd = (int) (height * 0.5);
        cellInt = 0;
        cellEnd = 0;

        for (int row = rowInt; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_GREEN;
                flag[height - 1 - row][cell] = COLOR_GREEN;
            }
        }

        // COLOR GREEN --
        rowInt = (int) (height * 0.5) - 1;
        rowEnd = rowInt + 2;
        cellInt = 0;
        cellEnd = width;

        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_GREEN;
            }
        }

        // COLOR YELLOW >
        rowInt = 2;
        rowEnd = (int) (height * 0.5);
        cellInt = 0;
        cellEnd = 0;

        for (int row = rowInt; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_YELLOW;
                flag[height - 1 - row][cell] = COLOR_YELLOW;
            }
        }

        // COLOR BLACK >
        rowInt = 3;
        rowEnd = (int) (height * 0.5);
        cellInt = 0;
        cellEnd = 0;

        for (int row = rowInt; row < rowEnd; row++) {
            cellEnd++;
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLACK;
                flag[height - 1 - row][cell] = COLOR_BLACK;
            }
        }

        return flag;
    }

    // Función para crear la bandera de Suiza (SUI)
    public static int[][] createSuiFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowEnd = 0;
        int cellInt = 0;
        int cellEnd = 0;

        rowEnd = height;
        cellEnd = width;
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowEnd = (int) (height * 0.1);
        cellEnd = width;
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowInt = (int) (height * 0.1);
        rowEnd = (int) (height * 0.35);
        cellEnd = (int) (width * 0.4);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowInt = (int) (height * 0.35);
        rowEnd = (int) (height * 0.6);
        cellEnd = (int) (width * 0.20);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowInt = (int) (height * 0.6);
        rowEnd = (int) (height * 0.9);
        cellEnd = (int) (width * 0.4);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowInt = (int) (height * 0.9);
        rowEnd = height;
        cellEnd = width;
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowInt = (int) (height * 0.1);
        rowEnd = (int) (height * 0.35);
        cellInt = (int) (width * 0.6);
        cellEnd = width;
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowInt = (int) (height * 0.35);
        rowEnd = (int) (height * 0.6);
        cellInt = (int) (width * 0.8);
        cellEnd = width;
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowInt = (int) (height * 0.6);
        rowEnd = (int) (height * 0.9);
        cellInt = (int) (width * 0.6);
        cellEnd = width;
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }

    // Función para crear la bandera de Finlandia (FIN)
    public static int[][] createFinFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowEnd = 0;
        int cellInt = 0;
        int cellEnd = 0;

        rowEnd = (int) (height * 0.4);
        cellEnd = (int) (width * 0.2);
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowEnd = (int) (height * 0.45);
        cellInt = (int) (width * 0.4);
        cellEnd = width;
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowInt = (int) (height * 0.55);
        rowEnd = height;
        cellEnd = (int) (width * 0.3);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowInt = (int) (height * 0.55);
        rowEnd = height;
        cellInt = (int) (width * 0.4);
        cellEnd = width;
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowInt = (int) (height * 0.35);
        rowEnd = (int) (height * 0.6);
        cellInt = 0;
        cellEnd = width;
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        rowEnd = height;
        cellInt = (int) (width * 0.2);
        cellEnd = (int) (width * 0.45);
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        return flag;
    }

    // Función para crear la bandera de Dinamarca (DNK)
    public static int[][] createDnkFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowInt = 0;
        int rowEnd = 0;
        int cellInt = 0;
        int cellEnd = 0;

        rowEnd = height;
        cellInt = (int) (width * 0.3);
        cellEnd = (int) (width * 0.4);
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowEnd = (int) (height * 0.45);
        cellEnd = (int) (width * 0.3);
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = 0; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowEnd = (int) (height * 0.45);
        cellInt = (int) (width * 0.4);
        cellEnd = width;
        for (int row = 0; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowInt = (int) (height * 0.45);
        rowEnd = (int) (height * 0.55);
        cellInt = 0;
        cellEnd = width;
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowInt = (int) (height * 0.55);
        rowEnd = height;
        cellInt = 0;
        cellEnd = (int) (width * 0.3);
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowInt = (int) (height * 0.55);
        rowEnd = height;
        cellInt = (int) (width * 0.4);
        cellEnd = width;
        for (int row = rowInt; row < rowEnd; row++) {
            for (int cell = cellInt; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }

    public static void showColorArray2D(String title, int[][] colorArray) {
        int height = colorArray.length;
        int width = colorArray[0].length;

        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int y = 0; y < height; y++) {
                    for (int x = 0; x < width; x++) {
                        g.setColor(new Color(colorArray[y][x]));
                        g.drawLine(x, y, x, y);
                    }
                }
            }
        };

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        int choice;
        do {
            String input = JOptionPane.showInputDialog(
                    "Elija una bandera para ver:\n" +
                            "1. Colombia\n" +
                            "2. Venezuela\n" +
                            "3. Polonia\n" +
                            "4. Panamá\n" +
                            "5. Sudáfrica\n" +
                            "6. Suiza+\n" +
                            "7. Finlandia\n" +
                            "8. Dinamarca\n" +
                            "0. Salir"
            );

            if (input == null || input.isEmpty()) {
                return; // El usuario canceló o ingresó un valor vacío
            }

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                choice = 0; // Valor no válido
            }

            switch (choice) {
                case 1:
                    int[][] flagCOL = createCOLFlag(11, 15);
                    JOptionPaneArrays.showColorArray2D(null, flagCOL);
                    break;
                case 2:
                    int[][] flagVEN = createVENFlag(10, 15);
                    JOptionPaneArrays.showColorArray2D(null, flagVEN);
                    break;
                case 3:
                    int[][] flagPOL = createPOLFlag(10, 15);
                    JOptionPaneArrays.showColorArray2D(null, flagPOL);
                    break;
                case 4:
                    int[][] flagPAN = createPANFlag(10, 10);
                    JOptionPaneArrays.showColorArray2D(null, flagPAN);
                    break;
                case 5:
                    int[][] flagZAF = createZAFFlag(24, 40);
                    JOptionPaneArrays.showColorArray2D(null, flagZAF);
                    break;
                case 6:
                    int[][] flagCHE = createSuiFlag(24, 40);
                    JOptionPaneArrays.showColorArray2D(null, flagCHE);
                    break;
                case 7:
                    int[][] flagFIN = createFinFlag(24, 40);
                    JOptionPaneArrays.showColorArray2D(null, flagFIN);
                    break;
                case 8:
                    int[][] flagDNK = createDnkFlag(24, 40);
                    JOptionPaneArrays.showColorArray2D(null, flagDNK);
                    break;
                case 0:
                    return; // Salir del programa
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (true);
    }
}
