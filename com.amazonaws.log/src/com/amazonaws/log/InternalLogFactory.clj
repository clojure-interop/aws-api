(ns com.amazonaws.log.InternalLogFactory
  "Can be used to configure the default log factory for the AWSJavaClientCore
  and AWSJavaClientSigners. Default to JUL, unless AWSJavaClientRuntime is
  present which will default it to Jakarta Commons Logging."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.log InternalLogFactory]))

(defn ->internal-log-factory
  "Constructor."
  (^InternalLogFactory []
    (new InternalLogFactory )))

(defn *get-log
  "Returns an SDK logger that logs using the currently configured default
   log factory, given the class.

  clazz - `java.lang.Class`

  returns: `com.amazonaws.log.InternalLogApi`"
  (^com.amazonaws.log.InternalLogApi [^java.lang.Class clazz]
    (InternalLogFactory/getLog clazz)))

(defn *get-factory
  "Returns the current default log factory.

  returns: `com.amazonaws.log.InternalLogFactory`"
  (^com.amazonaws.log.InternalLogFactory []
    (InternalLogFactory/getFactory )))

(defn *configure-factory
  "Used to explicitly configure the log factory. The log factory can only be
   configured at most once. All subsequent configurations will have no
   effect.

   Note explicitly configuring the log factory will have positive
   performance impact on all subsequent logging, since the specific logger
   can be directly referenced instead of being searched every time.

  factory - the log factory to be used internally by the SDK - `com.amazonaws.log.InternalLogFactory`

  returns: true if the log factory is successfully configured; false
           otherwise (ie the log factory is not allowed to be configured
           more than once for performance reasons.) - `boolean`"
  (^Boolean [^com.amazonaws.log.InternalLogFactory factory]
    (InternalLogFactory/configureFactory factory)))

