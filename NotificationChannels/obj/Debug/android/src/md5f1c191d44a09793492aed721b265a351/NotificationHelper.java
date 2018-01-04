package md5f1c191d44a09793492aed721b265a351;


public class NotificationHelper
	extends android.content.ContextWrapper
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("NotificationChannels.NotificationHelper, NotificationChannels, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", NotificationHelper.class, __md_methods);
	}


	public NotificationHelper (android.content.Context p0)
	{
		super (p0);
		if (getClass () == NotificationHelper.class)
			mono.android.TypeManager.Activate ("NotificationChannels.NotificationHelper, NotificationChannels, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
