package source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FaqsPage extends JFrame {
    JButton backButton;

    public FaqsPage() {
        super("FAQs");
        this.setSize(1200, 710);
        setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        panel.add(createQuestionAnswerPanel("How do I schedule a test drive?", "Scheduling a test drive is easy! Simply visit our website and navigate to the \"Test Drive\" section. From there, you can fill out a form with your contact information and preferred date and time for the test drive. Alternatively, you can contact our dealership directly and speak with one of our representatives to arrange a test drive at your convenience."));
        panel.add(createQuestionAnswerPanel("What warranty coverage do you offer on your vehicles?", "We offer a comprehensive warranty package to provide peace of mind for our customers. Our standard warranty typically covers the vehicle for a specified period or mileage limit, whichever comes first. Additionally, we may offer extended warranty options for further coverage beyond the standard warranty period. For specific details about warranty coverage for a particular model, please refer to the vehicle's documentation or contact our customer service team."));
        panel.add(createQuestionAnswerPanel("Can I customize my vehicle with additional features or accessories?", "Yes, we offer a range of customization options to personalize your vehicle to your preferences. You can choose from various accessories, such as alloy wheels, roof racks, body kits, and interior upgrades, to enhance the appearance and functionality of your vehicle. Additionally, we may offer optional packages or trim levels with additional features and amenities. Contact our dealership or visit our website to explore the available customization options for your desired model."));
        panel.add(createQuestionAnswerPanel("How do I finance or lease a vehicle?", "Financing or leasing a vehicle is a straightforward process with our dealership. Our finance department can assist you in exploring various financing options tailored to your budget and credit profile. Whether you prefer to finance your purchase with a traditional auto loan or lease a vehicle for a fixed term, we can help you find the best solution for your needs. To get started, you can fill out a finance application online or visit our dealership to speak with a finance specialist."));
        panel.add(createQuestionAnswerPanel("How do I schedule maintenance or service appointments for my vehicle?", "Keeping your vehicle in optimal condition is essential for its performance and longevity. To schedule maintenance or service appointments, you can use our online service scheduler available on our website. Simply provide your vehicle's information, select the type of service needed, and choose a convenient date and time for your appointment. Alternatively, you can contact our service department directly by phone or email to schedule an appointment with one of our certified technicians."));

        backButton = new JButton("HOME");
        backButton.setFont(new Font("Aharoni", Font.BOLD, 25));
        backButton.setForeground(Color.black);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Home mainForm = new Home();
                mainForm.setVisible(true);
            }
        });
        panel.add(backButton);

        this.add(panel);
    }

    private JPanel createQuestionAnswerPanel(String question, String answer) {
        JPanel qaPanel = new JPanel();
        qaPanel.setLayout(new BorderLayout());

        JLabel questionLabel = new JLabel(question);
        JTextArea answerArea = new JTextArea(answer);
        answerArea.setLineWrap(true);
        answerArea.setWrapStyleWord(true);
        answerArea.setEditable(false);

        qaPanel.add(questionLabel, BorderLayout.NORTH);
        qaPanel.add(new JScrollPane(answerArea), BorderLayout.CENTER);

        return qaPanel;
    }
}


