(ns com.amazonaws.services.resourcegroupstaggingapi.AWSResourceGroupsTaggingAPIAsync
  "Interface for accessing AWS Resource Groups Tagging API asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSResourceGroupsTaggingAPIAsync instead.


  Resource Groups Tagging API

  This guide describes the API operations for the resource groups tagging.


  A tag is a label that you assign to an AWS resource. A tag consists of a key and a value, both of which you define.
  For example, if you have two Amazon EC2 instances, you might assign both a tag key of \"Stack.\" But the value of
  \"Stack\" might be \"Testing\" for one and \"Production\" for the other.


  Tagging can help you organize your resources and enables you to simplify resource management, access management and
  cost allocation.


  You can use the resource groups tagging API operations to complete the following tasks:




  Tag and untag supported resources located in the specified region for the AWS account




  Use tag-based filters to search for resources located in the specified region for the AWS account




  List all existing tag keys in the specified region for the AWS account




  List all existing values for the specified key in the specified region for the AWS account




  To make full use of the resource groups tagging API operations, you might need additional IAM permissions, including
  permission to access the resources of individual services as well as permission to view and apply tags to those
  resources. For more information, see Obtaining Permissions for Resource Groups and Tag Editor.


  You can use the Resource Groups Tagging API to tag resources for the following AWS services.




  Alexa for Business (a4b)




  API Gateway




  AWS AppStream




  AWS AppSync




  Amazon Athena




  Amazon Aurora




  AWS Certificate Manager




  AWS Certificate Manager Private CA




  Amazon Cloud Directory




  AWS CloudFormation




  Amazon CloudFront




  AWS CloudHSM




  AWS CloudTrail




  Amazon CloudWatch (alarms only)




  Amazon CloudWatch Events




  Amazon CloudWatch Logs




  AWS CodeBuild




  AWS CodeStar




  Amazon Cognito Identity




  Amazon Cognito User Pools




  Amazon Comprehend




  AWS Config




  AWS Data Pipeline




  AWS Database Migration Service




  AWS Datasync




  AWS Direct Connect




  AWS Directory Service




  Amazon DynamoDB




  Amazon EBS




  Amazon EC2




  Amazon ECR




  Amazon ECS




  AWS Elastic Beanstalk




  Amazon Elastic File System




  Elastic Load Balancing




  Amazon ElastiCache




  Amazon Elasticsearch Service




  AWS Elemental MediaLive




  AWS Elemental MediaPackage




  AWS Elemental MediaTailor




  Amazon EMR




  Amazon FSx




  Amazon Glacier




  AWS Glue




  Amazon Inspector




  AWS IoT Analytics




  AWS IoT Core




  AWS IoT Device Defender




  AWS IoT Device Management




  AWS IoT Greengrass




  AWS Key Management Service




  Amazon Kinesis




  Amazon Kinesis Data Analytics




  Amazon Kinesis Data Firehose




  AWS Lambda




  AWS License Manager




  Amazon Machine Learning




  Amazon MQ




  Amazon MSK




  Amazon Neptune




  AWS OpsWorks




  Amazon RDS




  Amazon Redshift




  AWS Resource Access Manager




  AWS Resource Groups




  AWS RoboMaker




  Amazon Route 53




  Amazon Route 53 Resolver




  Amazon S3 (buckets only)




  Amazon SageMaker




  AWS Secrets Manager




  AWS Service Catalog




  Amazon Simple Notification Service (SNS)




  Amazon Simple Queue Service (SQS)




  AWS Simple System Manager (SSM)




  AWS Step Functions




  AWS Storage Gateway




  AWS Transfer for SFTP




  Amazon VPC




  Amazon WorkSpaces"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.resourcegroupstaggingapi AWSResourceGroupsTaggingAPIAsync]))

(defn get-resources-async
  "Returns all the tagged or previously tagged resources that are located in the specified region for the AWS
   account. You can optionally specify filters (tags and resource types) in your request, depending on what
   information you want returned. The response includes all tags that are associated with the requested resources.



   You can check the PaginationToken response parameter to determine if a query completed. Queries can
   occasionally return fewer results on a page than allowed. The PaginationToken response parameter
   value is null only when there are no more results to display.

  get-resources-request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest get-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourcesAsync get-resources-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest get-resources-request]
    (-> this (.getResourcesAsync get-resources-request))))

(defn get-tag-keys-async
  "Returns all tag keys in the specified region for the AWS account.

  get-tag-keys-request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTagKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest get-tag-keys-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagKeysAsync get-tag-keys-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest get-tag-keys-request]
    (-> this (.getTagKeysAsync get-tag-keys-request))))

(defn get-tag-values-async
  "Returns all tag values for the specified key in the specified region for the AWS account.

  get-tag-values-request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTagValues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest get-tag-values-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagValuesAsync get-tag-values-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest get-tag-values-request]
    (-> this (.getTagValuesAsync get-tag-values-request))))

(defn tag-resources-async
  "Applies one or more tags to the specified resources. Note the following:




   Not all resources can have tags. For a list of resources that support tagging, see Supported Resources in the
   AWS Resource Groups User Guide.




   Each resource can have up to 50 tags. For other limits, see Tag Restrictions
   in the Amazon EC2 User Guide for Linux Instances.




   You can only tag resources that are located in the specified region for the AWS account.




   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as
   well as permissions for adding tags. For more information, see Obtaining
   Permissions for Tagging in the AWS Resource Groups User Guide.

  tag-resources-request - `com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest tag-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourcesAsync tag-resources-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest tag-resources-request]
    (-> this (.tagResourcesAsync tag-resources-request))))

(defn untag-resources-async
  "Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that
   key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were
   already removed. Note the following:




   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to
   as well as permissions for removing tags. For more information, see Obtaining
   Permissions for Tagging in the AWS Resource Groups User Guide.




   You can only tag resources that are located in the specified region for the AWS account.

  untag-resources-request - `com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest untag-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourcesAsync untag-resources-request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest untag-resources-request]
    (-> this (.untagResourcesAsync untag-resources-request))))

