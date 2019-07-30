(ns com.amazonaws.services.s3.S3ClientOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 S3ClientOptions$Builder]))

(defn build
  "returns: `com.amazonaws.services.s3.S3ClientOptions`"
  (^com.amazonaws.services.s3.S3ClientOptions [^S3ClientOptions$Builder this]
    (-> this (.build))))

(defn set-path-style-access
  "Configures the client to use path-style access for all requests.


   Amazon S3 supports virtual-hosted-style and path-style access in all
   Regions. The path-style syntax, however, requires that you use the
   region-specific endpoint when attempting to access a bucket.


   The default behaviour is to detect which access style to use based on
   the configured endpoint (an IP will result in path-style access) and
   the bucket being accessed (some buckets are not valid DNS names).
   Setting this flag will result in path-style access being used for all
   requests.

  path-style-access - True to always use path-style access. - `boolean`

  returns: this Builder instance that can be used for method chaining - `com.amazonaws.services.s3.S3ClientOptions$Builder`"
  (^com.amazonaws.services.s3.S3ClientOptions$Builder [^S3ClientOptions$Builder this ^Boolean path-style-access]
    (-> this (.setPathStyleAccess path-style-access))))

(defn set-accelerate-mode-enabled
  "Configures the client to use S3 accelerate endpoint for all requests.


   A bucket by default cannot be accessed in accelerate mode. If you
   wish to do so, you need to enable the accelerate configuration for
   the bucket in advance.

  accelerate-mode-enabled - `boolean`

  returns: `com.amazonaws.services.s3.S3ClientOptions$Builder`"
  (^com.amazonaws.services.s3.S3ClientOptions$Builder [^S3ClientOptions$Builder this ^Boolean accelerate-mode-enabled]
    (-> this (.setAccelerateModeEnabled accelerate-mode-enabled))))

(defn set-payload-signing-enabled
  "Configures the client to sign payloads in all situations.


   Payload signing is optional when chunked encoding is not used and requests are made
   against an HTTPS endpoint.  Under these conditions the client will by default
   opt to not sign payloads to optimize performance.  If this flag is set to true the
   client will instead always sign payloads.


   Note: Payload signing can be expensive, particularly if transferring
   large payloads in a single chunk.  Enabling this option will result in a performance
   penalty.

  payload-signing-enabled - True to explicitly enable payload signing in all situations - `boolean`

  returns: `com.amazonaws.services.s3.S3ClientOptions$Builder`"
  (^com.amazonaws.services.s3.S3ClientOptions$Builder [^S3ClientOptions$Builder this ^Boolean payload-signing-enabled]
    (-> this (.setPayloadSigningEnabled payload-signing-enabled))))

(defn disable-chunked-encoding
  "Configures the client to disable chunked encoding for all requests.


   The default behavior is to enable chunked encoding automatically for PutObjectRequest and
   UploadPartRequest. Setting this flag will result in disabling chunked encoding for all
   requests.


   Note: Enabling this option has performance implications since the checksum for the
   payload will have to be pre-calculated before sending the data. If your payload is large this
   will affect the overall time required to upload an object. Using this option is recommended
   only if your endpoint does not implement chunked uploading.

  returns: this Builder instance that can be used for method chaining - `com.amazonaws.services.s3.S3ClientOptions$Builder`"
  (^com.amazonaws.services.s3.S3ClientOptions$Builder [^S3ClientOptions$Builder this]
    (-> this (.disableChunkedEncoding))))

(defn enable-dualstack
  "Configures the client to use the dualstack endpoint for a region

   S3 supports dualstack endpoints which return both IPv6 and IPv4 values.
   Use of these endpoints is optional.

  returns: this Builder instance that can be used for method chaining - `com.amazonaws.services.s3.S3ClientOptions$Builder`"
  (^com.amazonaws.services.s3.S3ClientOptions$Builder [^S3ClientOptions$Builder this]
    (-> this (.enableDualstack))))

(defn enable-force-global-bucket-access
  "Force-enable global bucket access on the S3 client. Any bucket-related operations invoked against a client
   with this option enabled will potentially be executed against other regions than the one configured in the
   client in order to succeed.

  returns: this Builder instance that can be used for method chaining - `com.amazonaws.services.s3.S3ClientOptions$Builder`"
  (^com.amazonaws.services.s3.S3ClientOptions$Builder [^S3ClientOptions$Builder this]
    (-> this (.enableForceGlobalBucketAccess))))

