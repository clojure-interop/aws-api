(ns com.amazonaws.SDKGlobalConfiguration
  "SDKGlobalConfiguration is to configure any global settings"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws SDKGlobalConfiguration]))

(defn ->sdk-global-configuration
  "Constructor."
  (^SDKGlobalConfiguration []
    (new SDKGlobalConfiguration )))

(def *-disable-cert-checking-system-property
  "Static Constant.

  Disable validation of server certificates when using the HTTPS protocol. This should ONLY be
   used to do quick smoke tests against endpoints which don't yet have valid certificates; it
   should NEVER be used in production. This property is meant to be used as a flag (i.e.
   -Dcom.amazonaws.sdk.disableCertChecking) rather then taking a value
   (-Dcom.amazonaws.sdk.disableCertChecking=true). This property is treated as false by default
   (i.e. check certificates by default)

  type: java.lang.String"
  SDKGlobalConfiguration/DISABLE_CERT_CHECKING_SYSTEM_PROPERTY)

(def *-default-metrics-system-property
  "Static Constant.

  System property used when starting up the JVM to enable the default
   metrics collected by the AWS SDK, which uploads the derived statistics
   to Amazon CloudWatch.



   Example:
    -Dcom.amazonaws.sdk.enableDefaultMetrics

  type: java.lang.String"
  SDKGlobalConfiguration/DEFAULT_METRICS_SYSTEM_PROPERTY)

(def *-access-key-system-property
  "Static Constant.

  System property name for the AWS access key ID

  type: java.lang.String"
  SDKGlobalConfiguration/ACCESS_KEY_SYSTEM_PROPERTY)

(def *-secret-key-system-property
  "Static Constant.

  System property name for the AWS secret key

  type: java.lang.String"
  SDKGlobalConfiguration/SECRET_KEY_SYSTEM_PROPERTY)

(def *-session-token-system-property
  "Static Constant.

  System property name for the AWS session token

  type: java.lang.String"
  SDKGlobalConfiguration/SESSION_TOKEN_SYSTEM_PROPERTY)

(def *-aws-region-system-property
  "Static Constant.

  System property for the AWS region to use when creating clients.
   See DefaultAwsRegionProviderChain.

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_REGION_SYSTEM_PROPERTY)

(def *-ec-2-metadata-service-override-system-property
  "Static Constant.

  System property for overriding the Amazon EC2 Instance Metadata Service
   endpoint.

  type: java.lang.String"
  SDKGlobalConfiguration/EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY)

(def *-retry-throttling-system-property
  "Static Constant.

  System property for enabling retry throttling.

   Retry throttling is a feature which intelligently throttles retry attempts when a
   large percentage of requests are failing and retries are unsuccessful, particularly
   in scenarios of degraded service health.  In these situations the client will drain its
   internal retry capacity and slowly roll off from retry attempts until requests begin
   to succeed again.  At that point the retry capacity pool will begin to refill and
   retries will once again be permitted


   In situations where retries have been throttled this feature will effectively result in
   fail-fast behavior from the client.  Because retries are circumvented exceptions will
   be immediately returned to the caller if the initial request is unsuccessful.  This
   will result in a greater number of exceptions being returned up front but prevents
   requests being tied up attempting subsequent retries which are also likely to fail.

  type: java.lang.String"
  SDKGlobalConfiguration/RETRY_THROTTLING_SYSTEM_PROPERTY)

(def *-regions-file-override-system-property
  "Static Constant.

  Path to an override file for the region metadata loaded by the SDK
   that maps service/region pairs to endpoints and vice versa.

  type: java.lang.String"
  SDKGlobalConfiguration/REGIONS_FILE_OVERRIDE_SYSTEM_PROPERTY)

(def *-disable-remote-regions-file-system-property
  "Static Constant.

  By default, the SDK will attempt to download an up-to-date set of
   region metadata from Amazon CloudFront when first required. This allows
   you to look up information about new regions and services without having
   to download a new version of the SDK every time.

   If the SDK cannot download region metadata from Amazon CloudFront, it
   will fall back to loading the region metadata bundled with the SDK when
   it was released, which may be out of date.

   Setting this system property to anything other than null will
   disable this remote fetching, and will only load region
   metadata that was bundled with the SDK. This gives you control over
   when new region metadata will be picked up by your application, and
   isolates you from potential issues if your application depends on being
   able to load metadata about a region which is not included in your
   version of the SDK and therefore may not be available in the event of
   network outages.

  type: java.lang.String"
  SDKGlobalConfiguration/DISABLE_REMOTE_REGIONS_FILE_SYSTEM_PROPERTY)

(def *-enable-s-3-sigv-4-system-property
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  SDKGlobalConfiguration/ENABLE_S3_SIGV4_SYSTEM_PROPERTY)

(def *-enforce-s-3-sigv-4-system-property
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  SDKGlobalConfiguration/ENFORCE_S3_SIGV4_SYSTEM_PROPERTY)

(def *-disable-s-3-implicit-global-clients-system-property
  "Static Constant.

  By default, the S3 client constructor does not set a region.

   If the client is not configured with an explicit region, bucket operations
   (eg. listObjects) will attempt to determine the bucket's region the first
   time that bucket is seen. This may result in a cross-region call.

   Setting this system property to anything other than null or
   false will disable this implicit fixed-region invocation,
   and any attempt to use a regionless client will fail with an IllegalStateException.
   This allows SDK users to force all S3 clients to be created with a region defined,
   so that calls to unintended regions are avoided.

   Note: Even with this option enabled, SDK users can still create clients not
   attached to fixed regions using specific opt-in methods on the S3 client builder.
   For instance, the enableGlobalBucketAccess option explicitly allows
   creation of a client that will automatically identify the location of a bucket via
   a call to a single, fixed region.

  type: java.lang.String"
  SDKGlobalConfiguration/DISABLE_S3_IMPLICIT_GLOBAL_CLIENTS_SYSTEM_PROPERTY)

(def *-enable-in-region-optimized-mode
  "Static Constant.

  Overrides the client default ClientConfiguration to use
   configuration with values tailored towards clients operating in the
   same AWS region as the service endpoint they call.  Timeouts in
   in-region optimized configurations are generally set much lower than
   the client standard configuration.

  type: java.lang.String"
  SDKGlobalConfiguration/ENABLE_IN_REGION_OPTIMIZED_MODE)

(def *-default-s-3-stream-buffer-size
  "Static Constant.

  Deprecated. with AmazonWebServiceRequest.getRequestClientOptions()
   and RequestClientOptions.setReadLimit(int).

   The default size of the buffer when uploading data from a stream. A
   buffer of this size will be created and filled with the first bytes from
   a stream being uploaded so that any transmit errors that occur in that
   section of the data can be automatically retried without the caller's
   intervention.

   If not set, the default value of 128 KB will be used.

  type: java.lang.String"
  SDKGlobalConfiguration/DEFAULT_S3_STREAM_BUFFER_SIZE)

(def *-profiling-system-property
  "Static Constant.

  Deprecated. by DEFAULT_METRICS_SYSTEM_PROPERTY.

   Internal system property to enable timing info collection.

  type: java.lang.String"
  SDKGlobalConfiguration/PROFILING_SYSTEM_PROPERTY)

(def *-default-aws-csm-host
  "Static Constant.

  The default host used by client side monitoring.

  type: java.lang.String"
  SDKGlobalConfiguration/DEFAULT_AWS_CSM_HOST)

(def *-default-aws-csm-port
  "Static Constant.

  The default port used by client side monitoring.

  type: int"
  SDKGlobalConfiguration/DEFAULT_AWS_CSM_PORT)

(def *-default-aws-csm-client-id
  "Static Constant.

  The default client Id used by client side monitoring.

  type: java.lang.String"
  SDKGlobalConfiguration/DEFAULT_AWS_CSM_CLIENT_ID)

(def *-aws-csm-enabled-system-property
  "Static Constant.

  System property to enable/disable client side monitoring.

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_CSM_ENABLED_SYSTEM_PROPERTY)

(def *-aws-csm-host-system-property
  "Static Constant.

  System property to set the host that will receive the client side monitoring events.

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_CSM_HOST_SYSTEM_PROPERTY)

(def *-aws-csm-port-system-property
  "Static Constant.

  System property to set the port of the out of process client side
   monitoring agent.

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_CSM_PORT_SYSTEM_PROPERTY)

(def *-aws-csm-client-id-system-property
  "Static Constant.

  System property to set the client ID to use for client side monitoring
   events.

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_CSM_CLIENT_ID_SYSTEM_PROPERTY)

(def *-access-key-env-var
  "Static Constant.

  Environment variable name for the AWS access key ID

  type: java.lang.String"
  SDKGlobalConfiguration/ACCESS_KEY_ENV_VAR)

(def *-alternate-access-key-env-var
  "Static Constant.

  Alternate environment variable name for the AWS access key ID

  type: java.lang.String"
  SDKGlobalConfiguration/ALTERNATE_ACCESS_KEY_ENV_VAR)

(def *-secret-key-env-var
  "Static Constant.

  Environment variable name for the AWS secret key

  type: java.lang.String"
  SDKGlobalConfiguration/SECRET_KEY_ENV_VAR)

(def *-alternate-secret-key-env-var
  "Static Constant.

  Alternate environment variable name for the AWS secret key

  type: java.lang.String"
  SDKGlobalConfiguration/ALTERNATE_SECRET_KEY_ENV_VAR)

(def *-aws-session-token-env-var
  "Static Constant.

  Environment variable name for the AWS session token

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_SESSION_TOKEN_ENV_VAR)

(def *-aws-region-env-var
  "Static Constant.

  Environment variable containing region used to configure clients.

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_REGION_ENV_VAR)

(def *-aws-config-file-env-var
  "Static Constant.

  Environment variable to set an alternate path to the shared config file (default path is
   ~/.aws/config).

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_CONFIG_FILE_ENV_VAR)

(def *-aws-cbor-disable-env-var
  "Static Constant.

  Environment variable to disable CBOR protocol. This forces the request
   to be sent over the wire as a AWS JSON.

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_CBOR_DISABLE_ENV_VAR)

(def *-aws-cbor-disable-system-property
  "Static Constant.

  System property to disable CBOR protocol. This forces the request to be sent over the wire
   as a AWS JSON

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_CBOR_DISABLE_SYSTEM_PROPERTY)

(def *-aws-ion-binary-disable-env-var
  "Static Constant.

  Environment variable to disable Ion binary protocol. This forces the request
   to be sent over the wire as Ion text.

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_ION_BINARY_DISABLE_ENV_VAR)

(def *-aws-ion-binary-disable-system-property
  "Static Constant.

  System property to disable Ion binary protocol. This forces the request to be sent over the wire
   as Ion text

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_ION_BINARY_DISABLE_SYSTEM_PROPERTY)

(def *-aws-ec-2-metadata-disabled-env-var
  "Static Constant.

  Environment variable to disable loading credentials or regions from EC2 Metadata instance service.

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_EC2_METADATA_DISABLED_ENV_VAR)

(def *-aws-ec-2-metadata-disabled-system-property
  "Static Constant.

  System property to disable loading credentials or regions from EC2 Metadata instance service.

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_EC2_METADATA_DISABLED_SYSTEM_PROPERTY)

(def *-aws-csm-enabled-env-var
  "Static Constant.

  Environment variable to enable/disable client side monitoring.

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_CSM_ENABLED_ENV_VAR)

(def *-aws-csm-host-env-var
  "Static Constant.

  Environment variable to set the host to send client side monitor events to.

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_CSM_HOST_ENV_VAR)

(def *-aws-csm-port-env-var
  "Static Constant.

  Environment varaible to set the port of the out of process client side
   monitoring agent.

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_CSM_PORT_ENV_VAR)

(def *-aws-csm-client-id-env-var
  "Static Constant.

  Environment variable to set the client ID to use for client side
   monitoring events.

  type: java.lang.String"
  SDKGlobalConfiguration/AWS_CSM_CLIENT_ID_ENV_VAR)

(defn *set-global-time-offset
  "Deprecated. by SDKGlobalTime.setGlobalTimeOffset(int)

  time-offset - `int`"
  ([^Integer time-offset]
    (SDKGlobalConfiguration/setGlobalTimeOffset time-offset)))

(defn *get-global-time-offset
  "Deprecated. by SDKGlobalTime.getGlobalTimeOffset()

  returns: `int`"
  (^Integer []
    (SDKGlobalConfiguration/getGlobalTimeOffset )))

(defn *in-region-optimized-mode-enabled?
  "returns: `boolean`"
  (^Boolean []
    (SDKGlobalConfiguration/isInRegionOptimizedModeEnabled )))

(defn *cert-checking-disabled?
  "returns: `boolean`"
  (^Boolean []
    (SDKGlobalConfiguration/isCertCheckingDisabled )))

(defn *cbor-disabled?
  "returns: `boolean`"
  (^Boolean []
    (SDKGlobalConfiguration/isCborDisabled )))

(defn *ion-binary-disabled?
  "returns: `boolean`"
  (^Boolean []
    (SDKGlobalConfiguration/isIonBinaryDisabled )))

(defn *ec-2-metadata-disabled?
  "returns: `boolean`"
  (^Boolean []
    (SDKGlobalConfiguration/isEc2MetadataDisabled )))

