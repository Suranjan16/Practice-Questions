import java.util.*;

class Interval {
    int start; // minutes since 00:00
    int end;   // minutes since 00:00, end > start

    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

public class Main {

    // Parse "HH:MM" to minutes since midnight
    static int parseTime(String hhmm) {
        String[] parts = hhmm.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        return h * 60 + m;
    }

    // Parse "HH:MM->HH:MM" or "HH:MM-HH:MM" into Interval
    static Interval parseInterval(String line) {
        line = line.replace("->", "-"); // normalize separator
        String[] lr = line.trim().split("-");
        if (lr.length != 2) return null;
        int s = parseTime(lr[0]);
        int e = parseTime(lr[1]);
        if (e <= s) return null; // invalid if end <= start
        return new Interval(s, e);
    }

    static void processZone(String zoneName, List<Interval> intervals) {
        if (intervals.isEmpty()) {
            System.out.println(zoneName + " total=0 longest=0 windows=0");
            return;
        }

        // Sort intervals by start time
        intervals.sort(Comparator.comparingInt(a -> a.start));

        List<Interval> merged = new ArrayList<>();
        for (Interval cur : intervals) {
            if (merged.isEmpty() || cur.start > merged.get(merged.size() - 1).end) {
                merged.add(new Interval(cur.start, cur.end));
            } else {
                Interval last = merged.get(merged.size() - 1);
                last.end = Math.max(last.end, cur.end);
            }
        }

        // Compute stats
        int total = 0;
        int longest = 0;
        for (Interval in : merged) {
            int duration = in.end - in.start;
            total += duration;
            longest = Math.max(longest, duration);
        }
        int windows = merged.size();

        System.out.println(zoneName + " total=" + total + " longest=" + longest + " windows=" + windows);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < z; i++) {
            String zoneLine = sc.nextLine().trim();
            String zoneName = zoneLine.split("\\s+", 2)[1]; // after "ZONE"
            int n = Integer.parseInt(sc.nextLine().trim());

            List<Interval> intervals = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                String line = sc.nextLine();
                Interval interval = parseInterval(line);
                if (interval != null) {
                    intervals.add(interval);
                }
            }

            processZone(zoneName, intervals);
        }

        sc.close();
    }
}

