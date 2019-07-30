(ns com.amazonaws.log.CommonsLog
  "Used to delegate internal logging of the signers and core classes to Jakarta
  Commons Logging."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.log CommonsLog]))

(defn fatal
  "Description copied from interface: InternalLogApi

  message - log this message - `java.lang.Object`
  t - log this cause - `java.lang.Throwable`"
  ([^CommonsLog this ^java.lang.Object message ^java.lang.Throwable t]
    (-> this (.fatal message t)))
  ([^CommonsLog this ^java.lang.Object message]
    (-> this (.fatal message))))

(defn info-enabled?
  "Description copied from interface: InternalLogApi

  returns: true if info is enabled in the underlying logger. - `boolean`"
  (^Boolean [^CommonsLog this]
    (-> this (.isInfoEnabled))))

(defn trace
  "Description copied from interface: InternalLogApi

  message - log this message - `java.lang.Object`
  t - log this cause - `java.lang.Throwable`"
  ([^CommonsLog this ^java.lang.Object message ^java.lang.Throwable t]
    (-> this (.trace message t)))
  ([^CommonsLog this ^java.lang.Object message]
    (-> this (.trace message))))

(defn info
  "Description copied from interface: InternalLogApi

  message - log this message - `java.lang.Object`
  t - log this cause - `java.lang.Throwable`"
  ([^CommonsLog this ^java.lang.Object message ^java.lang.Throwable t]
    (-> this (.info message t)))
  ([^CommonsLog this ^java.lang.Object message]
    (-> this (.info message))))

(defn warn
  "Description copied from interface: InternalLogApi

  message - log this message - `java.lang.Object`
  t - log this cause - `java.lang.Throwable`"
  ([^CommonsLog this ^java.lang.Object message ^java.lang.Throwable t]
    (-> this (.warn message t)))
  ([^CommonsLog this ^java.lang.Object message]
    (-> this (.warn message))))

(defn error
  "Description copied from interface: InternalLogApi

  message - log this message - `java.lang.Object`
  t - log this cause - `java.lang.Throwable`"
  ([^CommonsLog this ^java.lang.Object message ^java.lang.Throwable t]
    (-> this (.error message t)))
  ([^CommonsLog this ^java.lang.Object message]
    (-> this (.error message))))

(defn error-enabled?
  "Description copied from interface: InternalLogApi

  returns: true if error is enabled in the underlying logger. - `boolean`"
  (^Boolean [^CommonsLog this]
    (-> this (.isErrorEnabled))))

(defn trace-enabled?
  "Description copied from interface: InternalLogApi

  returns: true if trace is enabled in the underlying logger. - `boolean`"
  (^Boolean [^CommonsLog this]
    (-> this (.isTraceEnabled))))

(defn debug
  "Description copied from interface: InternalLogApi

  message - log this message - `java.lang.Object`
  t - log this cause - `java.lang.Throwable`"
  ([^CommonsLog this ^java.lang.Object message ^java.lang.Throwable t]
    (-> this (.debug message t)))
  ([^CommonsLog this ^java.lang.Object message]
    (-> this (.debug message))))

(defn debug-enabled?
  "Description copied from interface: InternalLogApi

  returns: true if debug is enabled in the underlying logger. - `boolean`"
  (^Boolean [^CommonsLog this]
    (-> this (.isDebugEnabled))))

(defn fatal-enabled?
  "Description copied from interface: InternalLogApi

  returns: true if fatal is enabled in the underlying logger. - `boolean`"
  (^Boolean [^CommonsLog this]
    (-> this (.isFatalEnabled))))

(defn warn-enabled?
  "Description copied from interface: InternalLogApi

  returns: true if warn is enabled in the underlying logger. - `boolean`"
  (^Boolean [^CommonsLog this]
    (-> this (.isWarnEnabled))))

