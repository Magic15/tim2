package com.example.tim.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ListServiceImpl implements ListService
{
    private Random random = new Random();

    @Override
    public List<Integer> getList(int n)
    {
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(100));
        }

        return list;
    }
}
