package ro.ase.cts.s02;

import java.io.*;

public class MatrixDataHandler {
    private int[][] matrix;
    private int height;
    private int width;
    private String filename;
    
    /**
     * 
     * @param h
     * @param w
     * @param filename
     */
    public MatrixDataHandler(int h, int w, String filename) {
    	
        MatrixInit(h, w, filename);

        try {
            FileWriter fw = new FileWriter(filename);
            fw.write(h + " " + w + "\n");
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    fw.write(matrix[i][j] + " ");
                }
                fw.write("\n");
            }
            fw.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
    
    public void MatrixInit(int h, int w, String filename) {
    	this.height = h;
        this.width = w;
        this.filename = filename;
        matrix = new int[h][];
        for (int i = 0; i < h; i++) {
            matrix[i] = new int[w];
        }
    }
    
    public void readFile(String filename) throws IOException {
    	try {
            // !!!
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            height = Integer.parseInt(line.split(" ")[0]);
            width = Integer.parseInt(line.split(" ")[1]);

            for (int i = 0; i < height; i++) {
                line = br.readLine();
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
            }
            br.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public int getValueFromPosition(String filename, int posH, int posW) {
        try {
            readFile(filename);
            return matrix[posH][posW];
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return -1;
        }
    }

    public void modifyValueAndUpdateFile(String filename, int posH, int posW, int val) {
        try {
            // !!!
            readFile(filename);
            matrix[posH][posW] = val;
            FileWriter fw = new FileWriter("matrix.txt");
            fw.write(height + " " + width + "\n");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    fw.write(matrix[i][j] + " ");
                }
                fw.write("\n");
            }
            fw.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
