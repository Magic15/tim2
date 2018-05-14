package com.example.tim.Services;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AverageServiceImpl implements AverageService
{

    private Random random = new Random();

    @Override
    public List<Integer> getList()
    {
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++)
        {
            list.add(random.nextInt(10000));
        }
        return list;
    }

    @Override
    public List<Integer> getList2(int n)
    {
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(100));
        }

        return list;
    }

    @Override
    public float countAverage(Integer[] list)
    {
        int sum = 0;
        float average = 0;

        for(int i = 0 ; i < list.length; i++)
        {
            sum = sum + list[i];
        }
        if(list.length > 0)
            average = (float)sum/(float)list.length;
        return average;
    }
}
