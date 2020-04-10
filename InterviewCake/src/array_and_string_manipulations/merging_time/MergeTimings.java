package array_and_string_manipulations.merging_time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//For example:

//new Meeting(2, 3);  // meeting from 10:00 – 10:30 am
//new Meeting(6, 9);  // meeting from 12:00 – 1:30 pm

//Write a method mergeRanges() that takes a list of multiple meeting time ranges and returns a list of condensed ranges.

//For example, given:

//  [Meeting(0, 1), Meeting(3, 5), Meeting(4, 8), Meeting(10, 12), Meeting(9, 10)]

//your method would return:

//[Meeting(0, 1), Meeting(3, 8), Meeting(9, 12)]

public class MergeTimings {

	public static void main(String...strings) {
		
		final List<Meeting> meetings = Arrays.asList(
	            new Meeting(1, 10), new Meeting(2, 5), new Meeting(6, 8),
	            new Meeting(9, 10), new Meeting(10, 12));
		
		Collections.sort(meetings, new SortMeetings());
		
		List<Meeting> meet = mergeRanges(meetings);
		
		for (Meeting m : meet) {
			System.out.println(m.getStartTime() + "----" + m.getEndTime());
		}
	}

	public static List<Meeting> mergeRanges(List<Meeting> meetings) {
		
		if (meetings.size() <= 0) {
			return meetings;
		}
		
		List<Meeting> newMeetingList = new ArrayList<Meeting>();
		
		int START_TIME = meetings.get(0).getStartTime();
		int END_TIME = meetings.get(0).getEndTime();
		
		Meeting m = new Meeting(START_TIME, END_TIME);
		
		for (int i = 1; i < meetings.size(); i++) {
			
			if (END_TIME < meetings.get(i).getStartTime()) {
				m.setEndTime(END_TIME);
				newMeetingList.add(m);
				START_TIME = meetings.get(i).getStartTime();
				m = new Meeting(START_TIME, 0);
				END_TIME = meetings.get(i).getEndTime();
			} else if (END_TIME < meetings.get(i).getEndTime()) {
				END_TIME = meetings.get(i).getEndTime();
			}
		}
		m.setEndTime(END_TIME);
		newMeetingList.add(m);
		
		return newMeetingList;
	}
}

