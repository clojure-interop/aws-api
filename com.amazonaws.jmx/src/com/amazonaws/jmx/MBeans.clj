(ns com.amazonaws.jmx.MBeans
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmx MBeans]))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (MBeans c : MBeans.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.jmx.MBeans[]`"
  ([]
    (MBeans/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.jmx.MBeans`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.jmx.MBeans [^java.lang.String name]
    (MBeans/valueOf name)))

(defn *register-m-bean
  "Registers the given MBean under the given object name to the first
   registered MBean server, or the platform MBean server if there is no
   explicitly registered MBean server.

  object-name - `java.lang.String`
  mbean - `T`

  returns: true if the registration succeeded, or false if an MBean already
           exists under the given object name. - `<T> boolean`

  throws: javax.management.MBeanRegistrationException - The preRegister (MBeanRegistration interface) method of the MBean has thrown an exception. The MBean will not be registered."
  ([^java.lang.String object-name mbean]
    (MBeans/registerMBean object-name mbean)))

(defn *unregister-m-bean
  "Unregisters the MBean under the given object name to the first MBean
   server, or the platform MBean server if there is no explicitly registered
   MBean server.

  object-name - `java.lang.String`

  returns: true if the unregistration succeeded, or false if the MBean
           doesn't exist under the given object name. - `<T> boolean`

  throws: javax.management.MBeanRegistrationException - Wraps exceptions thrown by the preRegister(), preDeregister() methods of the MBeanRegistration interface."
  ([^java.lang.String object-name]
    (MBeans/unregisterMBean object-name)))

(defn *registered?
  "Returns true if an MBean identified by the specified object name is
   already registered with the first MBean server, or the platform MBean
   server if there is no explicitly registered MBean server; false
   otherwise.

  object-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String object-name]
    (MBeans/isRegistered object-name)))

(defn *get-m-bean-server
  "Returns the first registered MBean server, or the platform MBean server
   if there is none.

  returns: `javax.management.MBeanServer`"
  (^javax.management.MBeanServer []
    (MBeans/getMBeanServer )))

