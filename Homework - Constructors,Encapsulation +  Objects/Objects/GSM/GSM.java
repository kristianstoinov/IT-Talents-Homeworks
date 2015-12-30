public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	Call call;
	double priceForMinute = 0.20;

	public void insertSimCar(String simMobileNumber) {
		if (simMobileNumber != null) {
			if ((simMobileNumber.startsWith("08"))
					&& simMobileNumber.length() == 10) {
				hasSimCard = true;
				this.simMobileNumber = simMobileNumber;
			}
		}
	}

	public void removeSimCard() {
		this.hasSimCard = false;
	}

	public void call(GSM receiver, int duration) {
		if (duration > 0 && duration <= 60) {
			if (!this.call.caller.equals(call.receiver)) {
				if (this.hasSimCard == true) {
					Call newCall = new Call();
					newCall.caller = this;
					newCall.receiver = receiver;
					newCall.duration = duration;
					this.lastOutgoingCall = newCall.receiver.lastIncomingCall;
					this.lastIncomingCall = newCall.caller.lastOutgoingCall;
					outgoingCallsDuration += duration;
				}
			}
		}
	}

	public double getSumForCall() {
		return this.outgoingCallsDuration * priceForMinute;
	}

	
	void printInfoForCall(Call call){
		if (call != null) {
			System.out.println(call.caller.simMobileNumber + " called "
					+ call.receiver.simMobileNumber + " for a duration of "
					+ call.duration);
		}
		
	}
	
	void printInfoForLastIncomingCall() {
		printInfoForCall(this.lastIncomingCall);
	}

	void printInfoForLastOutgoingCall(){
		printInfoForCall(this.lastOutgoingCall);
	}
	
}
