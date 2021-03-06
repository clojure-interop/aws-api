(ns com.amazonaws.services.s3.AmazonS3Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 AmazonS3Builder]))

(defn payload-signing-enabled?
  "returns: The current setting for payload signing configured in the builder. - `java.lang.Boolean`"
  (^java.lang.Boolean [^AmazonS3Builder this]
    (-> this (.isPayloadSigningEnabled))))

(defn force-global-bucket-access-enabled?
  "returns: Whether global bucket access is configured for clients generated by this builder. - `java.lang.Boolean`"
  (^java.lang.Boolean [^AmazonS3Builder this]
    (-> this (.isForceGlobalBucketAccessEnabled))))

(defn enable-path-style-access
  "Enables path style access for clients built via this builder.

   Amazon S3 supports virtual-hosted-style and path-style access in all Regions. The
   path-style syntax, however, requires that you use the region-specific endpoint when
   attempting to access a bucket.

   The default behaviour is to detect which access style to use based on the configured
   endpoint (an IP will result in path-style access) and the bucket being accessed (some buckets
   are not valid DNS names). Setting this flag will result in path-style access being used for
   all requests.

  returns: This object for method chaining. - `Subclass`"
  ([^AmazonS3Builder this]
    (-> this (.enablePathStyleAccess))))

(defn set-dualstack-enabled
  "Configures the client to use Amazon S3 dualstack mode for all requests.

  dualstack-enabled - True to enable dualstack mode. - `java.lang.Boolean`"
  ([^AmazonS3Builder this ^java.lang.Boolean dualstack-enabled]
    (-> this (.setDualstackEnabled dualstack-enabled))))

(defn chunked-encoding-disabled?
  "returns: The current setting for chunked encoding configured in the builder. - `java.lang.Boolean`"
  (^java.lang.Boolean [^AmazonS3Builder this]
    (-> this (.isChunkedEncodingDisabled))))

(defn disable-chunked-encoding
  "Disables chunked encoding on clients built via the builder.

   The default behavior is to enable chunked encoding automatically for PutObjectRequest and
   UploadPartRequest. Setting this flag will result in disabling chunked encoding for all
   requests.

   Note: Enabling this option has performance implications since the checksum for the
   payload will have to be pre-calculated before sending the data. If your payload is large this
   will affect the overall time required to upload an object. Using this option is recommended
   only if your endpoint does not implement chunked uploading.

  returns: this Builder instance that can be used for method chaining - `Subclass`"
  ([^AmazonS3Builder this]
    (-> this (.disableChunkedEncoding))))

(defn enable-accelerate-mode
  "Enables accelerate mode on clients built with the builder.

   A bucket by default cannot be accessed in accelerate mode. If you wish to do so, you need
   to enable the accelerate configuration for the bucket in advance. To enable accelerate mode
   see AmazonS3Client.setBucketAccelerateConfiguration(com.amazonaws.services.s3.model.SetBucketAccelerateConfigurationRequest).

  returns: This object for method chaining. - `Subclass`"
  ([^AmazonS3Builder this]
    (-> this (.enableAccelerateMode))))

(defn set-force-global-bucket-access-enabled
  "Configure whether global bucket access is enabled for clients generated by this builder.

   When global bucket access is enabled, the region to which a request is routed may differ from the region that
   is configured in AwsClientBuilder.setRegion(String) in order to make the request succeed.


   The following behavior is currently used when this mode is enabled:

       All requests that do not act on an existing bucket (for example, AmazonS3Client.createBucket(String))
       will be routed to the region configured by AwsClientBuilder.setRegion(String), unless the region is manually overridden
       with CreateBucketRequest.setRegion(String), in which case the request will be routed to the region
       configured in the request.
       The first time a request is made that references an existing bucket (for example,
       AmazonS3Client.putObject(PutObjectRequest)) a request will be made to the region configured by
       AwsClientBuilder.setRegion(String) to determine the region in which the bucket was created. This location may be
       cached in the client for subsequent requests acting on that same bucket.



   Enabling this mode has several drawbacks, because it has the potential to increase latency in the event that
   the location of the bucket is physically far from the location from which the request was invoked. For this
   reason, it is strongly advised when possible to know the location of your buckets and create a region-specific
   client to access that bucket.

  force-global-bucket-access-enabled - Whether global bucket access should be enabled. - `java.lang.Boolean`"
  ([^AmazonS3Builder this ^java.lang.Boolean force-global-bucket-access-enabled]
    (-> this (.setForceGlobalBucketAccessEnabled force-global-bucket-access-enabled))))

(defn path-style-access-enabled?
  "returns: The current setting for path style access configured in the builder. - `java.lang.Boolean`"
  (^java.lang.Boolean [^AmazonS3Builder this]
    (-> this (.isPathStyleAccessEnabled))))

(defn set-payload-signing-enabled
  "Configures the client to sign payloads in all situations.

   Payload signing is optional when chunked encoding is not used and requests are made
   against an HTTPS endpoint.  Under these conditions the client will by default opt to not sign
   payloads to optimize performance.  If this flag is set to true the client will instead always
   sign payloads.

   Note: Payload signing can be expensive, particularly if transferring large payloads
   in a single chunk.  Enabling this option will result in a performance penalty.

  payload-signing-enabled - True to explicitly enable payload signing in all situations - `java.lang.Boolean`"
  ([^AmazonS3Builder this ^java.lang.Boolean payload-signing-enabled]
    (-> this (.setPayloadSigningEnabled payload-signing-enabled))))

(defn enable-force-global-bucket-access
  "Enable global bucket access for clients generated by this builder.

  returns: This object for method chaining. - `Subclass`"
  ([^AmazonS3Builder this]
    (-> this (.enableForceGlobalBucketAccess))))

(defn enable-dualstack
  "Enables dualstack mode on clients built with the builder.

  returns: This object for method chaining. - `Subclass`"
  ([^AmazonS3Builder this]
    (-> this (.enableDualstack))))

(defn set-path-style-access-enabled
  "Configures the client to use path-style access for all requests.

   Amazon S3 supports virtual-hosted-style and path-style access in all Regions. The
   path-style syntax, however, requires that you use the region-specific endpoint when
   attempting to access a bucket.

   The default behaviour is to detect which access style to use based on the configured
   endpoint (an IP will result in path-style access) and the bucket being accessed (some buckets
   are not valid DNS names). Setting this flag will result in path-style access being used for
   all requests.

  path-style-access-enabled - True to always use path-style access. - `java.lang.Boolean`"
  ([^AmazonS3Builder this ^java.lang.Boolean path-style-access-enabled]
    (-> this (.setPathStyleAccessEnabled path-style-access-enabled))))

(defn with-chunked-encoding-disabled
  "Configures the client to disable chunked encoding for all requests.

   The default behavior is to enable chunked encoding automatically for PutObjectRequest and
   UploadPartRequest. Setting this flag will result in disabling chunked encoding for all
   requests.

   Note: Enabling this option has performance implications since the checksum for the
   payload will have to be pre-calculated before sending the data. If your payload is large this
   will affect the overall time required to upload an object. Using this option is recommended
   only if your endpoint does not implement chunked uploading.

  chunked-encoding-disabled - True to disable chunked encoding. - `java.lang.Boolean`

  returns: this Builder instance that can be used for method chaining - `Subclass`"
  ([^AmazonS3Builder this ^java.lang.Boolean chunked-encoding-disabled]
    (-> this (.withChunkedEncodingDisabled chunked-encoding-disabled))))

(defn set-chunked-encoding-disabled
  "Configures the client to disable chunked encoding for all requests.

   The default behavior is to enable chunked encoding automatically for PutObjectRequest and
   UploadPartRequest. Setting this flag will result in disabling chunked encoding for all
   requests.

   Note: Enabling this option has performance implications since the checksum for the
   payload will have to be pre-calculated before sending the data. If your payload is large this
   will affect the overall time required to upload an object. Using this option is recommended
   only if your endpoint does not implement chunked uploading.

  chunked-encoding-disabled - True to disable chunked encoding. - `java.lang.Boolean`"
  ([^AmazonS3Builder this ^java.lang.Boolean chunked-encoding-disabled]
    (-> this (.setChunkedEncodingDisabled chunked-encoding-disabled))))

(defn with-payload-signing-enabled
  "Configures the client to sign payloads in all situations.

   Payload signing is optional when chunked encoding is not used and requests are made
   against an HTTPS endpoint. Under these conditions the client will by default opt to not sign
   payloads to optimize performance.  If this flag is set to true the client will instead always
   sign payloads.

   Note: Payload signing can be expensive, particularly if transferring large payloads
   in a single chunk. Enabling this option will result in a performance penalty.

  payload-signing-enabled - True to explicitly enable payload signing in all situations - `java.lang.Boolean`

  returns: This object for method chaining. - `Subclass`"
  ([^AmazonS3Builder this ^java.lang.Boolean payload-signing-enabled]
    (-> this (.withPayloadSigningEnabled payload-signing-enabled))))

(defn dualstack-enabled?
  "returns: The current setting for dualstack mode configured in the builder. - `java.lang.Boolean`"
  (^java.lang.Boolean [^AmazonS3Builder this]
    (-> this (.isDualstackEnabled))))

(defn with-dualstack-enabled
  "Configures the client to use Amazon S3 dualstack mode for all requests.

  dualstack-enabled - True to enable dualstack mode. - `java.lang.Boolean`

  returns: This object for method chaining. - `Subclass`"
  ([^AmazonS3Builder this ^java.lang.Boolean dualstack-enabled]
    (-> this (.withDualstackEnabled dualstack-enabled))))

(defn with-force-global-bucket-access-enabled
  "Configure whether global bucket access is enabled for clients generated by this builder.

  force-global-bucket-access-enabled - Whether global bucket access should be enabled. - `java.lang.Boolean`

  returns: This object for method chaining. - `Subclass`"
  ([^AmazonS3Builder this ^java.lang.Boolean force-global-bucket-access-enabled]
    (-> this (.withForceGlobalBucketAccessEnabled force-global-bucket-access-enabled))))

(defn set-accelerate-mode-enabled
  "Configures the client to use S3 accelerate endpoint for all requests.

   A bucket by default cannot be accessed in accelerate mode. If you wish to do so, you need
   to enable the accelerate configuration for the bucket in advance. To enable accelerate mode
   see AmazonS3Client.setBucketAccelerateConfiguration(com.amazonaws.services.s3.model.SetBucketAccelerateConfigurationRequest).

  accelerate-mode-enabled - True to enable accelerate mode. - `java.lang.Boolean`"
  ([^AmazonS3Builder this ^java.lang.Boolean accelerate-mode-enabled]
    (-> this (.setAccelerateModeEnabled accelerate-mode-enabled))))

(defn with-accelerate-mode-enabled
  "Configures the client to use S3 accelerate endpoint for all requests.

   A bucket by default cannot be accessed in accelerate mode. If you wish to do so, you need
   to enable the accelerate configuration for the bucket in advance. To enable accelerate mode
   see AmazonS3Client.setBucketAccelerateConfiguration(com.amazonaws.services.s3.model.SetBucketAccelerateConfigurationRequest).

  accelerate-mode-enabled - True to enable accelerate mode. - `java.lang.Boolean`

  returns: This object for method chaining. - `Subclass`"
  ([^AmazonS3Builder this ^java.lang.Boolean accelerate-mode-enabled]
    (-> this (.withAccelerateModeEnabled accelerate-mode-enabled))))

(defn accelerate-mode-enabled?
  "returns: The current setting for accelerate mode configured in the builder. - `java.lang.Boolean`"
  (^java.lang.Boolean [^AmazonS3Builder this]
    (-> this (.isAccelerateModeEnabled))))

(defn enable-payload-signing
  "Enables payload signing for all situations on clients built via this builder.

   Payload signing is optional when chunked encoding is not used and requests are made
   against an HTTPS endpoint.  Under these conditions the client will by default opt to not sign
   payloads to optimize performance.  If this flag is set to true the client will instead always
   sign payloads.

   Note: Payload signing can be expensive, particularly if transferring large payloads
   in a single chunk.  Enabling this option will result in a performance penalty.

  returns: This object for method chaining. - `Subclass`"
  ([^AmazonS3Builder this]
    (-> this (.enablePayloadSigning))))

(defn with-path-style-access-enabled
  "Configures the client to use path-style access for all requests.

   Amazon S3 supports virtual-hosted-style and path-style access in all Regions. The
   path-style syntax, however, requires that you use the region-specific endpoint when
   attempting to access a bucket.

    The default behaviour is to detect which access style to use based on the configured
   endpoint (an IP will result in path-style access) and the bucket being accessed (some buckets
   are not valid DNS names). Setting this flag will result in path-style access being used for
   all requests.

  path-style-access-enabled - True to always use path-style access. - `java.lang.Boolean`

  returns: This object for method chaining. - `Subclass`"
  ([^AmazonS3Builder this ^java.lang.Boolean path-style-access-enabled]
    (-> this (.withPathStyleAccessEnabled path-style-access-enabled))))

