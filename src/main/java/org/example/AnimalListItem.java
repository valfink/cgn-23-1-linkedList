package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalListItem {
    private Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AnimalListItem{" +
                "value=" + value +
                '}';
    }
}
