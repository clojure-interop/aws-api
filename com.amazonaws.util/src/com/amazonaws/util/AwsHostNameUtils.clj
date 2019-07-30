(ns com.amazonaws.util.AwsHostNameUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util AwsHostNameUtils]))

(defn ->aws-host-name-utils
  "Constructor."
  (^AwsHostNameUtils []
    (new AwsHostNameUtils )))

(defn *parse-region-name
  "Deprecated. in favor of parseRegion(String, String).

  host - the hostname to parse - `java.lang.String`
  service-hint - an optional hint about the service for the endpoint - `java.lang.String`

  returns: the region parsed from the hostname, or
                       \"us-east-1\" if no region information
                       could be found. - `java.lang.String`"
  (^java.lang.String [^java.lang.String host ^java.lang.String service-hint]
    (AwsHostNameUtils/parseRegionName host service-hint))
  (^java.lang.String [^java.net.URI endpoint]
    (AwsHostNameUtils/parseRegionName endpoint)))

(defn *parse-region
  "Attempts to parse the region name from an endpoint based on conventions
   about the endpoint format.

  host - the hostname to parse - `java.lang.String`
  service-hint - an optional hint about the service for the endpoint - `java.lang.String`

  returns: the region parsed from the hostname, or
                       null if no region information could be found. - `java.lang.String`"
  (^java.lang.String [^java.lang.String host ^java.lang.String service-hint]
    (AwsHostNameUtils/parseRegion host service-hint)))

(defn *parse-service-name
  "Deprecated.

  endpoint - `java.net.URI`

  returns: `java.lang.String`"
  (^java.lang.String [^java.net.URI endpoint]
    (AwsHostNameUtils/parseServiceName endpoint)))

(defn *local-host-name
  "Returns the host name for the local host. If the operation is not allowed
   by the security check, the textual representation of the IP address of
   the local host is returned instead. If the ip address of the local host
   cannot be resolved or if there is any other failure, \"localhost\" is
   returned as a fallback.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AwsHostNameUtils/localHostName )))

