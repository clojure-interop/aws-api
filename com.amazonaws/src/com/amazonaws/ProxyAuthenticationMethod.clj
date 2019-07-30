(ns com.amazonaws.ProxyAuthenticationMethod
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws ProxyAuthenticationMethod]))

(def SPNEGO
  "Enum Constant.

  type: com.amazonaws.ProxyAuthenticationMethod"
  ProxyAuthenticationMethod/SPNEGO)

(def KERBEROS
  "Enum Constant.

  type: com.amazonaws.ProxyAuthenticationMethod"
  ProxyAuthenticationMethod/KERBEROS)

(def NTLM
  "Enum Constant.

  type: com.amazonaws.ProxyAuthenticationMethod"
  ProxyAuthenticationMethod/NTLM)

(def DIGEST
  "Enum Constant.

  type: com.amazonaws.ProxyAuthenticationMethod"
  ProxyAuthenticationMethod/DIGEST)

(def BASIC
  "Enum Constant.

  type: com.amazonaws.ProxyAuthenticationMethod"
  ProxyAuthenticationMethod/BASIC)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ProxyAuthenticationMethod c : ProxyAuthenticationMethod.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.ProxyAuthenticationMethod[]`"
  ([]
    (ProxyAuthenticationMethod/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.ProxyAuthenticationMethod`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.ProxyAuthenticationMethod [^java.lang.String name]
    (ProxyAuthenticationMethod/valueOf name)))

