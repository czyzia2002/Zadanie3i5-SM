package com.csconter.zadanie3;

import androidx.fragment.app.Fragment;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity { // Dziedziczenie

    @Override
    protected Fragment createFragment() { // Przesłonięta metoda do tworzenia fragmentu
        UUID taskId = (UUID)getIntent().getSerializableExtra(TaskListFragment.KEY_EXTRA_TASK_ID); // Pobranie identyfikatora zadania z intencji, getSerializableExtra - przeysłanie danych między komponentami
        return TaskFragment.newInstance(taskId);  // Utworzenie i zwrócenie fragmentu TaskFragment z identyfikatorem zadania
    }
}