(ns com.amazonaws.SDKGlobalTime
  "Used for clock skew adjustment between the client JVM where the SDK is run,
  and the server side."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws SDKGlobalTime]))

(defn ->sdk-global-time
  "Constructor."
  (^SDKGlobalTime []
    (new SDKGlobalTime )))

(defn *set-global-time-offset
  "Sets the global time difference in seconds between the running JVM and
   AWS. If this value is set then all the subsequent instantiation of an
   AmazonHttpClient will start using this
   value to generate timestamps.

  time-offset - the time difference in seconds between the running JVM and AWS - `int`"
  ([^Integer time-offset]
    (SDKGlobalTime/setGlobalTimeOffset time-offset)))

(defn *get-global-time-offset
  "Gets the global time difference in seconds between the running JVM and
   AWS. See Request#getTimeOffset() if global time offset is
   not set.

  returns: `int`"
  (^Integer []
    (SDKGlobalTime/getGlobalTimeOffset )))

