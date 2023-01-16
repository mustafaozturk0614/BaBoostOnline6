package com.bilgeadam.lesson043.dependencyInversion;

import com.bilgeadam.lesson043.utility.Kullanici;

public interface IEmailSendable {

	void emailGonder(Kullanici kullanici);
}
