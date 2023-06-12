package GUI;

import BackEnd.NewGame;
import BackEnd.NoWinGame;
import BackEnd.PlayerWin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.SystemColor.menu;

public class Game implements ActionListener {
    private Frame frame;
    private NewGame newGame;
    private JPanel game;
    private JButton array11;
    private JButton array12;
    private JButton array13;
    private JButton array21;
    private JButton array22;
    private JButton array23;
    private JButton array31;
    private JButton array33;
    private JButton array32;
    private JLabel player2Score;
    private JLabel player1Score;
    private JButton restartButton;
    private JLabel nextPlayer;
    private JButton butExit;

    //Tu m·m pripravenÈ moje icony pre hru ktore budem nadstavovaù buttonom
    ImageIcon iconX = new ImageIcon("D:\\Kurz\\Macrosoft\\TicTacToe\\src\\img\\X.jpg");
    ImageIcon iconO = new ImageIcon("D:\\Kurz\\Macrosoft\\TicTacToe\\src\\img\\O.jpg");
    ImageIcon iconFree = new ImageIcon("D:\\Kurz\\Macrosoft\\TicTacToe\\src\\img\\free.jpg");

    //Konötruktor ktorÈmu dod·m frame a  riadiacu triedu
    public Game(Frame frame, NewGame newGame) {
        this.frame = frame;
        this.newGame = newGame;
        //Prid·m pre vöetky buttony acctionListener
        //Buttony su pomenovanÈ podla ËÌsiel. array11 = button 1 riadok poradie 1 v riadku / array32 = button 3 riadok poradie 2 v riadku
        array11.addActionListener(this);
        array12.addActionListener(this);
        array13.addActionListener(this);
        array21.addActionListener(this);
        array22.addActionListener(this);
        array23.addActionListener(this);
        array31.addActionListener(this);
        array32.addActionListener(this);
        array33.addActionListener(this);
        restartButton.addActionListener(this);
        butExit.addActionListener(this);

        //Nasetujem pre label texty v podobe X alebo O podla toho ktor˝ znak reprezentuje ktoreho hr·Ëa / meno hr·Ëa : / skÛre hr·Ëa
        player1Score.setText("X - " + newGame.getPlayer1().getName() + " : " + newGame.getPlayer1().getScore());
        player2Score.setText("O - " + newGame.getPlayer2().getName() + " : " + newGame.getPlayer2().getScore());

        //Nasetujem icony ktore vyzeraj˙ ako pr·zdne polÌËko kaûdemu buttonu
        array11.setIcon(iconFree);
        array12.setIcon(iconFree);
        array13.setIcon(iconFree);
        array21.setIcon(iconFree);
        array22.setIcon(iconFree);
        array23.setIcon(iconFree);
        array31.setIcon(iconFree);
        array32.setIcon(iconFree);
        array33.setIcon(iconFree);

        //tento kod mi uloûÌ do randNumber 1 alebo 2 a podla toho budem urËovaù nahodne kto zaËÌna
        int randNumber = (Math.random() <= 0.5) ? 1 : 2;
        // sem budem vipisovat nahodne kto zacina a potm sa to bude po kazdom kole striedaù
        nextPlayer.setText("It's her turn : " + ((randNumber < 2) ? newGame.getPlayer1().getName() : newGame.getPlayer2().getName()));

    }

    //Metody ktore budem volaù podla toho kto je na ùahu
    private void nextP1(){nextPlayer.setText("It's her turn : " + newGame.getPlayer1().getName());}
    private void nextP2(){nextPlayer.setText("It's her turn : " + newGame.getPlayer2().getName());}


    @Override
    public void actionPerformed(ActionEvent e) {
        //Ak je kliknutÈ na exit tak zavriem aplik·ciu
        if (e.getSource().equals(butExit)){
            System.exit(0);
        }
        //Button restart vymaûe hr·Ëom skÛre a vytvor˝ nov˙ hru
        if (e.getSource().equals(restartButton)){
            newGame.getPlayer1().setScore(0);
            newGame.getPlayer2().setScore(0);
            frame.setContext(new Game(frame , newGame).getContent());
        }
        //Ak je kliknutÈ na array11 skontrolujem Ëi je polÌËko (ikona) pr·zdna
        //Ak je pr·zdna nasetujem tam X alebo O podla toho kto je na rade a takto pokraËujem pre kaûd˝ button
        //NextP2() metoda prehodÌ hr·Ëa aby bol na rade druh˝ hr·Ë
        if (e.getSource().equals(array11)){
            if(array11.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("It's her turn : " + newGame.getPlayer1().getName())) {
                    array11.setIcon(iconX);
                    nextP2();
                }else {array11.setIcon(iconO); nextP1();}
                winControl();
            }
        }
        if (e.getSource().equals(array12)){
            if (array12.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("It's her turn : " + newGame.getPlayer1().getName())) {
                    array12.setIcon(iconX);
                    nextP2();
                } else {array12.setIcon(iconO);nextP1();}
                winControl();
            }
        }
        if (e.getSource().equals(array13)){
            if (array13.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("It's her turn : " + newGame.getPlayer1().getName())) {
                    array13.setIcon(iconX);
                    nextP2();
                } else {array13.setIcon(iconO);nextP1();}
                winControl();
            }
        }
        if (e.getSource().equals(array21)){
            if (array21.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("It's her turn : " + newGame.getPlayer1().getName())) {
                    array21.setIcon(iconX);
                    nextP2();
                } else {array21.setIcon(iconO);nextP1();}
                winControl();
            }
        }
        if (e.getSource().equals(array22)){
            if (array22.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("It's her turn : " + newGame.getPlayer1().getName())) {
                    array22.setIcon(iconX);
                    nextP2();
                } else {array22.setIcon(iconO);nextP1();}
                winControl();
            }
        }
        if (e.getSource().equals(array23)){
            if (array23.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("It's her turn : " + newGame.getPlayer1().getName())) {
                    array23.setIcon(iconX);
                    nextP2();
                } else {array23.setIcon(iconO);nextP1();}
                winControl();
            }
        }
        if (e.getSource().equals(array31)){
            if (array31.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("It's her turn : " + newGame.getPlayer1().getName())) {
                    array31.setIcon(iconX);
                    nextP2();
                } else {array31.setIcon(iconO);nextP1();}
                winControl();
            }
        }
        if (e.getSource().equals(array32)){
            if (array32.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("It's her turn : " + newGame.getPlayer1().getName())) {
                    array32.setIcon(iconX);
                    nextP2();
                } else {array32.setIcon(iconO);nextP1();}
                winControl();
            }
        }
        if (e.getSource().equals(array33)){
            if (array33.getIcon() == iconFree) {
                if (nextPlayer.getText().equals("It's her turn : " + newGame.getPlayer1().getName())) {
                    array33.setIcon(iconX);
                    nextP2();
                } else {array33.setIcon(iconO);nextP1();}
                winControl();
            }
        }
    }
    public JPanel getContent(){
        return this.game;
    }
    public Frame getFrame(){return frame;}

    //Metoda zisùuje vÌùaza
    public void playerWinGame(JButton arrayWin){
        String winner;
        //Na vstupe mam jbutton ktorÌ obsahuje iconu vÌùaza takûe ju porovn·m s iconou X ak sa zhoduju vÌùaz je X
        //Hr·Ëovi s iconou X pridam ku skÛre +1 a do winnera uloûÌm jeho meno
        if (arrayWin.getIcon() == iconX){
            newGame.getPlayer1().setScore(newGame.getPlayer1().getScore()+1);
            winner = newGame.getPlayer1().getName();
            //Ak nieje vÌùaz X automaticky je to O takûe zoberem hr·Ëa s iconou O a prid·m mu skÛre a vloûim jeho meno do winnera
        }else {
            newGame.getPlayer2().setScore(newGame.getPlayer2().getScore()+1);
            winner= newGame.getPlayer2().getName();
        }
        //VyËistÌm pole t˝m ûe ho nasetujem na novo
        frame.setContext(new Game(frame , newGame).getContent());
        //VyskoËÌ okno ktore ma na vstupe meno vÌùaza
        PlayerWin okno = new PlayerWin(winner);
        //Nastavim viditelnosù okna na true
        okno.setVisible(true);
    }

    public boolean nWinGame() {
        //Metoda mi zistuje  Ëi su vöetky polia zmenenÈ ( ak by boli vöetky zmenenÈ a nikto by nebol vÌùaz je potrebne to oöetriù)
        boolean vsetkyZmenene = true;
        JButton[] arrayBut = {array11,array12,array13,array21,array22,array23,array31,array32,array33};
        //Prech·dzam pole a zisùujem Ëi su buttony nasetovane na iconFree alebo nie..
        for (int i = 0; i < arrayBut.length; i++) {
            if (arrayBut[i].getIcon() == iconFree) {
                vsetkyZmenene = false;
                //Ak je nejaky button s iconou IconFree tak hodnota boolean bude false a ukonËÌm prechod cyklom
                break;
            }
        }
        //Na zaËiatku metody sa vûdy nastavi boolean na true a v cykle overujeme Ëi ostali nejake iconFree
        //Ak ûiadne neostali tak ostane hodnota na true a tym p·dom sa vykon· nasleduj˙ci if ktor˝ len vr·ti true
        if (vsetkyZmenene) {
           return true;
        }return false;
    }
    //Metoda winControl je je vol·n· po kaûdom kliknutÌ na button a overuje mi podla podmienok Ëi niekde nem·me podla pravidiel
    // 3 kr·t X alebo 3 kr·t O.. Ak ·no tak hr·Ë vyhr·va a mi zavolame metodu playerWinGame ktor· vyhodÌ okno a na vstupe
    // dost·va button na ktorom je znak vÌùaza
    public void winControl(){
        if ((array11.getIcon() == array12.getIcon() && array12.getIcon() == array13.getIcon()) && array11.getIcon() != iconFree){
            playerWinGame(array11);
            return;
        }
        if ((array21.getIcon() == array22.getIcon() && array22.getIcon() == array23.getIcon()) && array21.getIcon() != iconFree){
            playerWinGame(array22);
            return;
        }
        if ((array31.getIcon() == array32.getIcon() && array32.getIcon() == array33.getIcon()) && array31.getIcon() != iconFree){
            playerWinGame(array31);
            return;
        }
        if ((array11.getIcon() == array21.getIcon() && array21.getIcon() == array31.getIcon()) && array11.getIcon() != iconFree){
            playerWinGame(array11);
            return;
        }
        if ((array12.getIcon() == array22.getIcon() && array22.getIcon() == array32.getIcon()) && array12.getIcon() != iconFree){
            playerWinGame(array12);
            return;
        }
        if ((array13.getIcon() == array23.getIcon() && array23.getIcon() == array33.getIcon()) && array13.getIcon() != iconFree){
            playerWinGame(array13);
            return;
        }
        if ((array11.getIcon() == array22.getIcon() && array22.getIcon() == array33.getIcon()) && array11.getIcon() != iconFree){
            playerWinGame(array11);
            return;
        }
        if ((array13.getIcon() == array22.getIcon() && array22.getIcon() == array31.getIcon()) && array13.getIcon() != iconFree){
            playerWinGame(array13);
            return;
        }
        //Ak sa dostane program aû sem tam mi neost·va logicky niË ine ako ûe su polia plnÈ a nem·me viùaza no aj tak to m·m oöetrenÈ kunkciou ktor· to overÌ
        //Ak je teda vöetko plnÈ a nem·me vÌùaza tak zavol·me okno NoWinGame a nastavim mu visible na true potom eöte nasetujem nov˝ kontext ktor˝ zresetuje hru
        if (nWinGame()){
            NoWinGame nW = new NoWinGame();
            nW.setVisible(true);
            frame.setContext(new Game(frame , newGame).getContent());

        }
    }

}
