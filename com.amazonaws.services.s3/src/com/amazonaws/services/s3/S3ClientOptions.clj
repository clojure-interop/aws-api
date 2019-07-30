(ns com.amazonaws.services.s3.S3ClientOptions
  "S3 client configuration options such as the request access style."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 S3ClientOptions]))

(defn ->s-3-client-options
  "Constructor.

  Deprecated. Will be removed once S3ClientOptions is made an immutable
               class.

  other - `com.amazonaws.services.s3.S3ClientOptions`"
  (^S3ClientOptions [^com.amazonaws.services.s3.S3ClientOptions other]
    (new S3ClientOptions other))
  (^S3ClientOptions []
    (new S3ClientOptions )))

(def *-default-path-style-access
  "Static Constant.

  The default setting for use of path-style access

  type: boolean"
  S3ClientOptions/DEFAULT_PATH_STYLE_ACCESS)

(def *-default-chunked-encoding-disabled
  "Static Constant.

  The default setting for use of chunked encoding

  type: boolean"
  S3ClientOptions/DEFAULT_CHUNKED_ENCODING_DISABLED)

(def *-default-payload-signing-enabled
  "Static Constant.

  The default setting for use of payload signing

  type: boolean"
  S3ClientOptions/DEFAULT_PAYLOAD_SIGNING_ENABLED)

(def *-default-accelerate-mode-enabled
  "Static Constant.

  S3 accelerate is by default not enabled

  type: boolean"
  S3ClientOptions/DEFAULT_ACCELERATE_MODE_ENABLED)

(def *-default-dualstack-enabled
  "Static Constant.

  S3 dualstack endpoint is by default not enabled

  type: boolean"
  S3ClientOptions/DEFAULT_DUALSTACK_ENABLED)

(def *-default-force-global-bucket-access-enabled
  "Static Constant.

  By default, clients should be created with a region.

  type: boolean"
  S3ClientOptions/DEFAULT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED)

(defn *builder
  "returns: a new S3ClientOptions builder. - `com.amazonaws.services.s3.S3ClientOptions$Builder`"
  (^com.amazonaws.services.s3.S3ClientOptions$Builder []
    (S3ClientOptions/builder )))

(defn payload-signing-enabled?
  "Returns whether the client is configured to sign payloads in all situations.


   Payload signing is optional when chunked encoding is not used and requests are made
   against an HTTPS endpoint.  Under these conditions the client will by default
   opt to not sign payloads to optimize performance.  If this flag is set to true the
   client will instead always sign payloads.


   Note: Payload signing can be expensive, particularly if transferring
   large payloads in a single chunk.  Enabling this option will result in a performance
   penalty.

  returns: True if body signing is explicitly enabled for all requests - `boolean`"
  (^Boolean [^S3ClientOptions this]
    (-> this (.isPayloadSigningEnabled))))

(defn force-global-bucket-access-enabled?
  "Returns whether the client should be configured with global bucket access enabled.

  returns: `boolean`"
  (^Boolean [^S3ClientOptions this]
    (-> this (.isForceGlobalBucketAccessEnabled))))

(defn chunked-encoding-disabled?
  "Returns whether the client has chunked encoding disabled for all requests.


   The default behavior is to enable chunked encoding automatically for PutObjectRequest and
   UploadPartRequest. Setting this flag will result in disabling chunked encoding for all
   requests.


   Note: Enabling this option has performance implications since the checksum for the
   payload will have to be pre-calculated before sending the data. If your payload is large this
   will affect the overall time required to upload an object. Using this option is recommended
   only if your endpoint does not implement chunked uploading.

  returns: True if chunked encoding is explicitly disabled for all requests - `boolean`"
  (^Boolean [^S3ClientOptions this]
    (-> this (.isChunkedEncodingDisabled))))

(defn disable-chunked-encoding
  "Deprecated. Use builder() to build new
               S3ClientOptions instead.

  returns: `com.amazonaws.services.s3.S3ClientOptions`"
  (^com.amazonaws.services.s3.S3ClientOptions [^S3ClientOptions this]
    (-> this (.disableChunkedEncoding))))

(defn path-style-access?
  "Returns whether the client uses path-style access for all requests.


   Amazon S3 supports virtual-hosted-style and path-style access in all
   Regions. The path-style syntax, however, requires that you use the
   region-specific endpoint when attempting to access a bucket.


   The default behaviour is to detect which access style to use based on
   the configured endpoint (an IP will result in path-style access) and
   the bucket being accessed (some buckets are not valid DNS names).
   Setting this flag will result in path-style access being used for all
   requests.

  returns: True is the client should always use path-style access - `boolean`"
  (^Boolean [^S3ClientOptions this]
    (-> this (.isPathStyleAccess))))

(defn with-chunked-encoding-disabled
  "Deprecated. Use builder() to build new
               S3ClientOptions instead.

  chunked-encoding-disabled - `boolean`

  returns: `com.amazonaws.services.s3.S3ClientOptions`"
  (^com.amazonaws.services.s3.S3ClientOptions [^S3ClientOptions this ^Boolean chunked-encoding-disabled]
    (-> this (.withChunkedEncodingDisabled chunked-encoding-disabled))))

(defn set-chunked-encoding-disabled
  "Deprecated. Use builder() to build new
               S3ClientOptions instead.

  chunked-encoding-disabled - `boolean`"
  ([^S3ClientOptions this ^Boolean chunked-encoding-disabled]
    (-> this (.setChunkedEncodingDisabled chunked-encoding-disabled))))

(defn dualstack-enabled?
  "Returns whether the client is configured to use dualstack mode for
   accessing S3.

  returns: True if the client will use the dualstack mode - `boolean`"
  (^Boolean [^S3ClientOptions this]
    (-> this (.isDualstackEnabled))))

(defn with-path-style-access
  "Deprecated. Use builder() to build new
               S3ClientOptions instead.

  path-style-access - `boolean`

  returns: `com.amazonaws.services.s3.S3ClientOptions`"
  (^com.amazonaws.services.s3.S3ClientOptions [^S3ClientOptions this ^Boolean path-style-access]
    (-> this (.withPathStyleAccess path-style-access))))

(defn accelerate-mode-enabled?
  "Returns whether the client has enabled accelerate mode for getting and putting objects.


   The default behavior is to disable accelerate mode for any operations (GET, PUT, DELETE). You need to call
   AmazonS3Client.setBucketAccelerateConfiguration(com.amazonaws.services.s3.model.SetBucketAccelerateConfigurationRequest)
   first to use this feature.

  returns: True if accelerate mode is enabled. - `boolean`"
  (^Boolean [^S3ClientOptions this]
    (-> this (.isAccelerateModeEnabled))))

(defn set-path-style-access
  "Deprecated. Use builder() to build new
               S3ClientOptions instead.

  path-style-access - `boolean`"
  ([^S3ClientOptions this ^Boolean path-style-access]
    (-> this (.setPathStyleAccess path-style-access))))

