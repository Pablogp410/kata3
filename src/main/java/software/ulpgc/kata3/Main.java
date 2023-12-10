package software.ulpgc.kata3;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.histogramDisplay().show(histogram());
        mainFrame.setVisible(true);
    }

    private static Histogram histogram() {
        return new Histogram() {
            @Override
            public int bins() {
                return 5;
            }

            @Override
            public double[] values() {
                return new double[]{1,4,5,2,5,7,8,5,2,9,7,8,4,2,6,7,4};
            }
        };
    }
}
