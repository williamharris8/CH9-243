import java.util.PriorityQueue;

public class MergerSimulator {

    public static void main(String[] args) {
        PriorityQueue<Company> market = new PriorityQueue<>();
        market.add(new Company("Disney", 42000));
        market.add(new Company("GE", 35500));
        market.add(new Company("Wayland-Yutani", 48000));
        market.add(new Company("ACME Corp", 3200));
        market.add(new Company("Stark Industries", 50000));
        market.add(new Company("Cyberdyne Systems", 12750));
        market.add(new Company("Umbrella Corp", 27300));
        market.add(new Company("Initech", 1000));
        market.add(new Company("Oscorp", 19900));
        market.add(new Company("Wonka Industries", 8400));

        Company smallest = market.poll();
        System.out.println("Smallest company: " + smallest);
        market.add(smallest);

        int mergers = 0;

        while (market.size() >= 2) {
            Company a = market.poll();
            Company b = market.poll();

            int newSize = (int) ((a.size + b.size) * 1.1);
            Company merged = new Company(a.name + "-" + b.name, newSize);
            market.add(merged);
            mergers++;

            System.out.println("MERGER: " + a.name + " and " + b.name + " have merged into "
                    + merged.name + " with size " + newSize + "!");
        }
    }
}

class Company implements Comparable<Company> {
    String name;
    int size;

    Company(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int compareTo(Company other) {
        return Integer.compare(this.size, other.size);
    }

    @Override
    public String toString() {
        return name + " (size: " + size + ")";
    }
}

