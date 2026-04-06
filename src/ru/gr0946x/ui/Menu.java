package ru.gr0946x.ui;

import javax.swing.*;

public class Menu extends JMenuBar {
    private final SelectablePanel mainPanel;

    public Menu(SelectablePanel mainPanel) {
        this.mainPanel = mainPanel;
        createMenu();
    }

    public void createMenu() {
        JMenu menu = new JMenu("Меню");

        JMenu fileMenu = new JMenu("Файл");

        JMenu fileSave = new JMenu("Сохранить как...");

        JMenuItem saveAsPNG = new JMenuItem("Файл png");
        JMenuItem saveAsJPG = new JMenuItem("Файл jpg");
        JMenuItem saveAsFrac = new JMenuItem("Файл frac");

        JMenuItem openFile = new JMenuItem("Открыть...");

        JMenuItem undo = new JMenuItem("Отменить [Ctrl + Z]");

        JMenuItem juliaSet = new JMenuItem("Показать множество Жюлиа");

        JMenuItem changeFractalFunc = new JMenuItem("Задать функцию построения фрактала...");

        JMenuItem changeColorize = new JMenuItem("Задать цветовую схему...");

        menu.add(fileMenu);
        fileMenu.add(fileSave);
        fileSave.add(saveAsPNG);
        fileSave.add(saveAsJPG);
        fileSave.add(saveAsFrac);
        fileMenu.add(openFile);
        menu.add(undo);
        menu.addSeparator();
        menu.add(juliaSet);
        menu.addSeparator();
        menu.add(changeFractalFunc);
        menu.add(changeColorize);

        add(menu);
    }
}
