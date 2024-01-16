package com.csconter.zadanie3;

import androidx.fragment.app.Fragment;
public class TaskListActivity extends SingleFragmentActivity { // Deklaracja klasy TaskListActivity, która dziedziczy po SingleFragmentActivity
    @Override
    protected Fragment createFragment() { // Przesłonięta metoda do tworzenia fragmentu
        return new TaskListFragment(); // Utworzenie i zwrócenie nowej instancji TaskListFragment
    }
}