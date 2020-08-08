
package me.zero.alpine.type;

public class Cancellable
{
    private boolean cancelled;
    
    public final void cancel() {
        this.cancelled = true;
    }
    
    public final boolean isCancelled() {
        return this.cancelled;
    }
}
