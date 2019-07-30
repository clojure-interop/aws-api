(ns com.amazonaws.auth.RSA
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth RSA]))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (RSA c : RSA.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.auth.RSA[]`"
  ([]
    (RSA/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.auth.RSA`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.auth.RSA [^java.lang.String name]
    (RSA/valueOf name)))

(defn *private-key-from-pkcs-8
  "Returns a private key constructed from the given DER bytes in PKCS#8 format.

  pkcs-8 - `byte[]`

  returns: `java.security.PrivateKey`

  throws: java.security.spec.InvalidKeySpecException"
  (^java.security.PrivateKey [pkcs-8]
    (RSA/privateKeyFromPKCS8 pkcs-8)))

(defn *private-key-from-pkcs-1
  "Returns a private key constructed from the given DER bytes in PKCS#1 format.

  pkcs-1 - `byte[]`

  returns: `java.security.PrivateKey`

  throws: java.security.spec.InvalidKeySpecException"
  (^java.security.PrivateKey [pkcs-1]
    (RSA/privateKeyFromPKCS1 pkcs-1)))

(defn *public-key-from
  "Returns a public key constructed from the given DER bytes.

  der-bytes - `byte[]`

  returns: `java.security.PublicKey`

  throws: java.security.spec.InvalidKeySpecException"
  (^java.security.PublicKey [der-bytes]
    (RSA/publicKeyFrom der-bytes)))

