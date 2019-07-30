(ns com.amazonaws.monitoring.ApiMonitoringEvent
  "Base class contains a collection of data that describes a specific Api Call event that occurs during the execution of SDK logic"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.monitoring ApiMonitoringEvent]))

(defn ->api-monitoring-event
  "Constructor."
  (^ApiMonitoringEvent []
    (new ApiMonitoringEvent )))

(defn get-type
  "returns: the type of the event - `java.lang.String`"
  (^java.lang.String [^ApiMonitoringEvent this]
    (-> this (.getType))))

(defn get-client-id
  "returns: The \"ClientId\" configuration value as obtained from an application configuration provider chain - `java.lang.String`"
  (^java.lang.String [^ApiMonitoringEvent this]
    (-> this (.getClientId))))

(defn get-user-agent
  "returns: The full value of the SDK's default user agent header for http requests. - `java.lang.String`"
  (^java.lang.String [^ApiMonitoringEvent this]
    (-> this (.getUserAgent))))

(defn with-api
  "Sets the api

  api - The new api value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiMonitoringEvent [^ApiMonitoringEvent this ^java.lang.String api]
    (-> this (.withApi api))))

(defn with-timestamp
  "Sets the timestamp, in milliseconds, since January 1st, 1970, for the time point at which the event.

  timestamp - The new timestamp value. - `java.lang.Long`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiMonitoringEvent [^ApiMonitoringEvent this ^java.lang.Long timestamp]
    (-> this (.withTimestamp timestamp))))

(defn with-service
  "Sets the service against which the call is being made.

  service - The new service value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiMonitoringEvent [^ApiMonitoringEvent this ^java.lang.String service]
    (-> this (.withService service))))

(defn get-timestamp
  "returns: Contains the elapsed time, in milliseconds, since January 1st, 1970, for the time point at which the event
   occurred. - `java.lang.Long`"
  (^java.lang.Long [^ApiMonitoringEvent this]
    (-> this (.getTimestamp))))

(defn with-version
  "Sets the version.

  version - the new version value. - `java.lang.Integer`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiMonitoringEvent [^ApiMonitoringEvent this ^java.lang.Integer version]
    (-> this (.withVersion version))))

(defn get-service
  "returns: The service against which the call is being made. - `java.lang.String`"
  (^java.lang.String [^ApiMonitoringEvent this]
    (-> this (.getService))))

(defn with-region
  "Sets the region

  region - The new region value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiMonitoringEvent [^ApiMonitoringEvent this ^java.lang.String region]
    (-> this (.withRegion region))))

(defn get-version
  "returns: the version. - `java.lang.Integer`"
  (^java.lang.Integer [^ApiMonitoringEvent this]
    (-> this (.getVersion))))

(defn with-user-agent
  "Sets the userAgent

  user-agent - The new userAgent value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiMonitoringEvent [^ApiMonitoringEvent this ^java.lang.String user-agent]
    (-> this (.withUserAgent user-agent))))

(defn with-client-id
  "Sets the clientId

  client-id - The new clientId value. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.monitoring.ApiMonitoringEvent`"
  (^com.amazonaws.monitoring.ApiMonitoringEvent [^ApiMonitoringEvent this ^java.lang.String client-id]
    (-> this (.withClientId client-id))))

(defn get-api
  "returns: the operation name for the api call being made. - `java.lang.String`"
  (^java.lang.String [^ApiMonitoringEvent this]
    (-> this (.getApi))))

(defn get-region
  "returns: the signing region used by the service client to perform the
   request's attempt(s).  For requests that end up making attempts to more than
   one region due to redirection, the region used on the final attempt must be
   used as the Region value for the overall Api Call event. - `java.lang.String`"
  (^java.lang.String [^ApiMonitoringEvent this]
    (-> this (.getRegion))))

