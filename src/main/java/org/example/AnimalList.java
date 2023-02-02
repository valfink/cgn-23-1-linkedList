package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalList {
    private AnimalListItem head;

    public void addFirst(Animal animal) {
        AnimalListItem oldHead = head;
        head = new AnimalListItem(animal, oldHead);
    }

    public void add(Animal animal) {
        AnimalListItem current = head;
        if (head == null) {
            addFirst(animal);
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new AnimalListItem(animal));
        }
    }

    @Override
    public String toString() {
        if (head == null) return "(empty)";
        AnimalListItem current = head;
        String result = current.toString();
        while (current.getNext() != null) {
            current = current.getNext();
            result += " -> " + current;
        }
        return result;
    }
}
