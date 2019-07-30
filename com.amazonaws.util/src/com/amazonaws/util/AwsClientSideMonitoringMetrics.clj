(ns com.amazonaws.util.AwsClientSideMonitoringMetrics
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util AwsClientSideMonitoringMetrics]))

(def ApiCallLatency
  "Enum Constant.

  The elapsed time, in milliseconds, between when the Api Call was begun and when a final response or error is
   manifested to the caller.

  type: com.amazonaws.util.AwsClientSideMonitoringMetrics"
  AwsClientSideMonitoringMetrics/ApiCallLatency)

(def MaxRetriesExceeded
  "Enum Constant.

  a boolean value that is false unless the Api call failed and the final attempt returned a retryable error.

  type: com.amazonaws.util.AwsClientSideMonitoringMetrics"
  AwsClientSideMonitoringMetrics/MaxRetriesExceeded)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (AwsClientSideMonitoringMetrics c : AwsClientSideMonitoringMetrics.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.util.AwsClientSideMonitoringMetrics[]`"
  ([]
    (AwsClientSideMonitoringMetrics/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.util.AwsClientSideMonitoringMetrics`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.util.AwsClientSideMonitoringMetrics [^java.lang.String name]
    (AwsClientSideMonitoringMetrics/valueOf name)))

