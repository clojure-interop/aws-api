(ns com.amazonaws.log.InternalLogApi
  "An SDK internal logging API, not intended for general use. This logging API
  allows a minimal set of signer related classes to make use of logging without
  direct dependency on any third party library."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.log InternalLogApi]))

(defn fatal
  "Logs an error with fatal log level.

  message - log this message - `java.lang.Object`
  t - log this cause - `java.lang.Throwable`"
  ([^InternalLogApi this ^java.lang.Object message ^java.lang.Throwable t]
    (-> this (.fatal message t)))
  ([^InternalLogApi this ^java.lang.Object message]
    (-> this (.fatal message))))

(defn info-enabled?
  "Is info logging currently enabled?

   Call this method to prevent having to perform expensive operations (for
   example, String concatenation) when the log level is more
   than info.

  returns: true if info is enabled in the underlying logger. - `boolean`"
  (^Boolean [^InternalLogApi this]
    (-> this (.isInfoEnabled))))

(defn trace
  "Logs an error with trace log level.

  message - log this message - `java.lang.Object`
  t - log this cause - `java.lang.Throwable`"
  ([^InternalLogApi this ^java.lang.Object message ^java.lang.Throwable t]
    (-> this (.trace message t)))
  ([^InternalLogApi this ^java.lang.Object message]
    (-> this (.trace message))))

(defn info
  "Logs an error with info log level.

  message - log this message - `java.lang.Object`
  t - log this cause - `java.lang.Throwable`"
  ([^InternalLogApi this ^java.lang.Object message ^java.lang.Throwable t]
    (-> this (.info message t)))
  ([^InternalLogApi this ^java.lang.Object message]
    (-> this (.info message))))

(defn warn
  "Logs an error with warn log level.

  message - log this message - `java.lang.Object`
  t - log this cause - `java.lang.Throwable`"
  ([^InternalLogApi this ^java.lang.Object message ^java.lang.Throwable t]
    (-> this (.warn message t)))
  ([^InternalLogApi this ^java.lang.Object message]
    (-> this (.warn message))))

(defn error
  "Logs an error with error log level.

  message - log this message - `java.lang.Object`
  t - log this cause - `java.lang.Throwable`"
  ([^InternalLogApi this ^java.lang.Object message ^java.lang.Throwable t]
    (-> this (.error message t)))
  ([^InternalLogApi this ^java.lang.Object message]
    (-> this (.error message))))

(defn error-enabled?
  "Is error logging currently enabled?

   Call this method to prevent having to perform expensive operations (for
   example, String concatenation) when the log level is more
   than error.

  returns: true if error is enabled in the underlying logger. - `boolean`"
  (^Boolean [^InternalLogApi this]
    (-> this (.isErrorEnabled))))

(defn trace-enabled?
  "Is trace logging currently enabled?

   Call this method to prevent having to perform expensive operations (for
   example, String concatenation) when the log level is more
   than trace.

  returns: true if trace is enabled in the underlying logger. - `boolean`"
  (^Boolean [^InternalLogApi this]
    (-> this (.isTraceEnabled))))

(defn debug
  "Logs an error with debug log level.

  message - log this message - `java.lang.Object`
  t - log this cause - `java.lang.Throwable`"
  ([^InternalLogApi this ^java.lang.Object message ^java.lang.Throwable t]
    (-> this (.debug message t)))
  ([^InternalLogApi this ^java.lang.Object message]
    (-> this (.debug message))))

(defn debug-enabled?
  "Is debug logging currently enabled?

   Call this method to prevent having to perform expensive operations (for
   example, String concatenation) when the log level is more
   than debug.

  returns: true if debug is enabled in the underlying logger. - `boolean`"
  (^Boolean [^InternalLogApi this]
    (-> this (.isDebugEnabled))))

(defn fatal-enabled?
  "Is fatal logging currently enabled?

   Call this method to prevent having to perform expensive operations (for
   example, String concatenation) when the log level is more
   than fatal.

  returns: true if fatal is enabled in the underlying logger. - `boolean`"
  (^Boolean [^InternalLogApi this]
    (-> this (.isFatalEnabled))))

(defn warn-enabled?
  "Is warn logging currently enabled?

   Call this method to prevent having to perform expensive operations (for
   example, String concatenation) when the log level is more
   than warn.

  returns: true if warn is enabled in the underlying logger. - `boolean`"
  (^Boolean [^InternalLogApi this]
    (-> this (.isWarnEnabled))))

