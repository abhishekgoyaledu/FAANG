package array_and_string_manipulations.merging_time;

import java.util.Comparator;

public class SortMeetings implements Comparator<Meeting> {

	@Override
	public int compare(Meeting o1, Meeting o2) {
		if (o1.getStartTime() == o2.getStartTime()) {
			return 0;
		}
		return o1.getStartTime() > o2.getStartTime() ? 1 : -1;
	}

}
