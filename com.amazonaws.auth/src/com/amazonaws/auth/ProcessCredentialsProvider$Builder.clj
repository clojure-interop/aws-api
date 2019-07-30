(ns com.amazonaws.auth.ProcessCredentialsProvider$Builder
  "Used to configure and create a ProcessCredentialsProvider. See ProcessCredentialsProvider.builder() creation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth ProcessCredentialsProvider$Builder]))

(defn with-command
  "command - `java.lang.String`

  returns: `com.amazonaws.auth.ProcessCredentialsProvider$Builder`"
  (^com.amazonaws.auth.ProcessCredentialsProvider$Builder [^ProcessCredentialsProvider$Builder this ^java.lang.String command]
    (-> this (.withCommand command))))

(defn set-credential-expiration-buffer
  "Configure the amount of time between when the credentials expire and when the credentials should start to be
   refreshed. This allows the credentials to be refreshed *before* they are reported to expire.

   Default: 15 seconds.

  value - `int`
  unit - `java.util.concurrent.TimeUnit`"
  ([^ProcessCredentialsProvider$Builder this ^Integer value ^java.util.concurrent.TimeUnit unit]
    (-> this (.setCredentialExpirationBuffer value unit))))

(defn with-credential-expiration-buffer
  "value - `int`
  unit - `java.util.concurrent.TimeUnit`

  returns: `com.amazonaws.auth.ProcessCredentialsProvider$Builder`"
  (^com.amazonaws.auth.ProcessCredentialsProvider$Builder [^ProcessCredentialsProvider$Builder this ^Integer value ^java.util.concurrent.TimeUnit unit]
    (-> this (.withCredentialExpirationBuffer value unit))))

(defn with-process-output-limit
  "output-byte-limit - `long`

  returns: `com.amazonaws.auth.ProcessCredentialsProvider$Builder`"
  (^com.amazonaws.auth.ProcessCredentialsProvider$Builder [^ProcessCredentialsProvider$Builder this ^Long output-byte-limit]
    (-> this (.withProcessOutputLimit output-byte-limit))))

(defn build
  "returns: `com.amazonaws.auth.ProcessCredentialsProvider`"
  (^com.amazonaws.auth.ProcessCredentialsProvider [^ProcessCredentialsProvider$Builder this]
    (-> this (.build))))

