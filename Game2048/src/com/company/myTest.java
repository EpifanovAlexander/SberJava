package com.company;

import java.util.List;

import static com.company.BoardTest.assertEquals;
import static java.util.Arrays.asList;

public class myTest {
    private final static GameHelper helper = new GameHelper();
    private final static Board board = new SquareBoard(2);

    public static void main(String[] args) {
        /*List<Integer> list = helper.moveAndMergeEqual(asList(2, 2, 4, 4));

        for (int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }*/

        /*board.fillBoard(asList(1,2,3,null));
        List<Key> list = board.getColumn(1);*/

        /*for (int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }*/

        board.fillBoard(asList(1,2,3,null));
        System.out.print(board.availableSpace().isEmpty());
    }

}
