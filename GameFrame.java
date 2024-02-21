public class GameFrame extends JFrame {
    public GameFrame() {
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add the game panel
        GamePanel gamePanel = new GamePanel();
        getContentPane().add(gamePanel);

        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameFrame());
    }
}
