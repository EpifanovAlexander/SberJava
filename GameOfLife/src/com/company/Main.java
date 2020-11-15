package com.company;

import java.util.Arrays;

public class Main {

    static int ourWorld[][] = new int[][]
            {
                    {0, 0, 0, 1, 1, 0, 0, 0, 1, 1},
                    {0, 1, 0, 0, 1, 1, 0, 0, 1, 1},
                    {0, 0, 1, 0, 0, 0, 1, 0, 1, 1},
                    {0, 1, 1, 0, 1, 0, 1, 0, 1, 1},
                    {0, 0, 0, 1, 1, 0, 0, 0, 1, 1},
                    {0, 1, 0, 0, 1, 1, 0, 1, 1, 1},
                    {0, 0, 1, 0, 0, 1, 1, 0, 1, 1},
                    {0, 1, 0, 1, 1, 0, 1, 0, 1, 1},
                    {0, 1, 0, 0, 1, 0, 0, 0, 1, 1},
                    {0, 1, 1, 0, 1, 0, 1, 0, 1, 1}
            };

    static int ourWorldPast[][] = new int[ourWorld.length][ourWorld[0].length];
    static int ourWorldPast2[][] = new int[ourWorld.length][ourWorld[0].length];
    static int ourWorldPast3[][] = new int[ourWorld.length][ourWorld[0].length];


    public static void main(String[] args) {
        int currentGeneration = 1;
        while (checkEndGame())
        {
            if (currentGeneration > 3)
            {
                for (int i=0; i<ourWorld.length; i++)
                {
                    for (int j=0; j<ourWorld[0].length; j++)
                    {
                        ourWorldPast3[i][j] = ourWorldPast2[i][j];
                    }
                }
            }

            if (currentGeneration > 2)
            {
                for (int i=0; i<ourWorld.length; i++)
                {
                    for (int j=0; j<ourWorld[0].length; j++)
                    {
                        ourWorldPast2[i][j] = ourWorldPast[i][j];
                    }
                }
            }

            for (int i=0; i<ourWorld.length; i++)
            {
                for (int j=0; j<ourWorld[0].length; j++)
                {
                    ourWorldPast[i][j] = ourWorld[i][j];
                }
            }

            System.out.println("Поколение "+ currentGeneration);
            for (int i=0; i<ourWorld.length; i++)
            {
                for (int j=0; j<ourWorld[0].length; j++)
                {
                    if (ourWorld[i][j] == 0)
                    {
                        if (countSum(i, j) == 3)
                        {
                            ourWorld[i][j] = 1;
                        }
                    }
                    else
                    {
                        ourWorld[i][j] = ((countSum(i, j) == 3) || (countSum(i, j) == 2)) ? 1 : 0;
                    }
                }
            }

            renderWorld(ourWorld);
            System.out.println();
            currentGeneration++;
        }
    }


    public static void renderWorld(int[][] world) {
        for (int[] line : world)
        {
            for (int symbol : line)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }


    public static boolean checkEndGame() {
        int sum = 0;
        for (int[] line : ourWorld)
        {
            for (int symbol : line)
            {
                sum += symbol;
            }
        }
        return !((sum == 0) || Arrays.deepEquals(ourWorldPast,ourWorld) || Arrays.deepEquals(ourWorldPast2,ourWorld) || Arrays.deepEquals(ourWorldPast3,ourWorld));
    }


    public static int countSum(int i, int j) {
        if (i == 0)
        {
            if (j==0)
            {
                return ourWorld[i][j+1] + ourWorld[i+1][j] + ourWorld[i+1][j+1];
            }
            if (j==ourWorld[0].length-1)
            {
                return ourWorld[i][j-1] + ourWorld[i+1][j] + ourWorld[i+1][j-1];
            }
            return ourWorld[i][j-1] + ourWorld[i][j+1] + ourWorld[i+1][j] + ourWorld[i+1][j-1] + ourWorld[i+1][j+1];
        }

        if (i == ourWorld.length-1)
        {
            if (j==0)
            {
                return ourWorld[i][j+1] + ourWorld[i-1][j] + ourWorld[i-1][j+1];
            }
            if (j==ourWorld[0].length-1)
            {
                return ourWorld[i][j-1] + ourWorld[i-1][j] + ourWorld[i-1][j-1];
            }
            return ourWorld[i][j-1] + ourWorld[i][j+1] + ourWorld[i-1][j] + ourWorld[i-1][j-1] + ourWorld[i-1][j+1];
        }

        if (j == 0)
        {
            return ourWorld[i-1][j] + ourWorld[i+1][j] + ourWorld[i-1][j+1] + ourWorld[i][j+1] + ourWorld[i+1][j+1];
        }

        if (j == ourWorld[0].length-1)
        {
            return ourWorld[i-1][j] + ourWorld[i+1][j] + ourWorld[i-1][j-1] + ourWorld[i][j-1] + ourWorld[i+1][j-1];
        }

        return ourWorld[i-1][j-1] + ourWorld[i-1][j] + ourWorld[i-1][j+1]
                + ourWorld[i][j-1] + ourWorld[i][j] + ourWorld[i][j+1]
                + ourWorld[i+1][j-1] + ourWorld[i+1][j] + ourWorld[i+1][j+1];
    }
}
