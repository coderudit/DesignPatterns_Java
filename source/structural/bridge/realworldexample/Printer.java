package structural.bridge.realworldexample;

import java.util.List;

public abstract class Printer {
	public String print(IFormatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}

	protected abstract List<Detail> getDetails();

	protected abstract String getHeader();
}
