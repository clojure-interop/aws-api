(ns com.amazonaws.services.cloudformation.AmazonCloudFormation
  "Interface for accessing AWS CloudFormation.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCloudFormation instead.


  AWS CloudFormation

  AWS CloudFormation allows you to create and manage AWS infrastructure deployments predictably and repeatedly. You can
  use AWS CloudFormation to leverage AWS products, such as Amazon Elastic Compute Cloud, Amazon Elastic Block Store,
  Amazon Simple Notification Service, Elastic Load Balancing, and Auto Scaling to build highly-reliable, highly
  scalable, cost-effective applications without creating or configuring the underlying AWS infrastructure.


  With AWS CloudFormation, you declare all of your resources and dependencies in a template file. The template defines
  a collection of resources as a single unit called a stack. AWS CloudFormation creates and deletes all member
  resources of the stack together and manages all dependencies between the resources for you.


  For more information about AWS CloudFormation, see the AWS
  CloudFormation Product Page.


  Amazon CloudFormation makes use of other AWS products. If you need additional technical information about a specific
  AWS product, you can find the product's technical documentation at docs.aws.amazon.com."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudformation AmazonCloudFormation]))

(defn detect-stack-drift
  "Detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration,
   as defined in the stack template and any values specified as template parameters. For each resource in the stack
   that supports drift detection, AWS CloudFormation compares the actual configuration of the resource with its
   expected template configuration. Only resource properties explicitly defined in the stack template are checked
   for drift. A stack is considered to have drifted if one or more of its resources differ from their expected
   template configurations. For more information, see Detecting
   Unregulated Configuration Changes to Stacks and Resources.


   Use DetectStackDrift to detect drift on all supported resources for a given stack, or
   DetectStackResourceDrift to detect drift on individual resources.


   For a list of stack resources that currently support drift detection, see Resources that Support Drift Detection.


   DetectStackDrift can take up to several minutes, depending on the number of resources contained
   within the stack. Use DescribeStackDriftDetectionStatus to monitor the progress of a detect stack drift
   operation. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return
   drift information about the stack and its resources.


   When detecting drift on a stack, AWS CloudFormation does not detect drift on any nested stacks belonging to that
   stack. Perform DetectStackDrift directly on the nested stack itself.

  detect-stack-drift-request - `com.amazonaws.services.cloudformation.model.DetectStackDriftRequest`

  returns: Result of the DetectStackDrift operation returned by the service. - `com.amazonaws.services.cloudformation.model.DetectStackDriftResult`"
  (^com.amazonaws.services.cloudformation.model.DetectStackDriftResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DetectStackDriftRequest detect-stack-drift-request]
    (-> this (.detectStackDrift detect-stack-drift-request))))

(defn describe-stack-drift-detection-status
  "Returns information about a stack drift detection operation. A stack drift detection operation detects whether a
   stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the
   stack template and any values specified as template parameters. A stack is considered to have drifted if one or
   more of its resources have drifted. For more information on stack and resource drift, see Detecting
   Unregulated Configuration Changes to Stacks and Resources.


   Use DetectStackDrift to initiate a stack drift detection operation. DetectStackDrift returns
   a StackDriftDetectionId you can use to monitor the progress of the operation using
   DescribeStackDriftDetectionStatus. Once the drift detection operation has completed, use
   DescribeStackResourceDrifts to return drift information about the stack and its resources.

  describe-stack-drift-detection-status-request - `com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusRequest`

  returns: Result of the DescribeStackDriftDetectionStatus operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusRequest describe-stack-drift-detection-status-request]
    (-> this (.describeStackDriftDetectionStatus describe-stack-drift-detection-status-request))))

(defn detect-stack-resource-drift
  "Returns information about whether a resource's actual configuration differs, or has drifted, from it's
   expected configuration, as defined in the stack template and any values specified as template parameters. This
   information includes actual and expected property values for resources in which AWS CloudFormation detects drift.
   Only resource properties explicitly defined in the stack template are checked for drift. For more information
   about stack and resource drift, see Detecting
   Unregulated Configuration Changes to Stacks and Resources.


   Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to
   detect drift on all resources in a given stack that support drift detection.


   Resources that do not currently support drift detection cannot be checked. For a list of resources that support
   drift detection, see Resources that Support Drift Detection.

  detect-stack-resource-drift-request - `com.amazonaws.services.cloudformation.model.DetectStackResourceDriftRequest`

  returns: Result of the DetectStackResourceDrift operation returned by the service. - `com.amazonaws.services.cloudformation.model.DetectStackResourceDriftResult`"
  (^com.amazonaws.services.cloudformation.model.DetectStackResourceDriftResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DetectStackResourceDriftRequest detect-stack-resource-drift-request]
    (-> this (.detectStackResourceDrift detect-stack-resource-drift-request))))

(defn update-stack-instances
  "Updates the parameter values for stack instances for the specified accounts, within the specified regions. A
   stack instance refers to a stack in a specific account and region.


   You can only update stack instances in regions and accounts where they already exist; to create additional stack
   instances, use CreateStackInstances.


   During stack set updates, any parameters overridden for a stack instance are not updated, but retain their
   overridden value.


   You can only update the parameter values that are specified in the stack set; to add or delete a parameter
   itself, use UpdateStackSet
    to update the stack set template. If you add a parameter to a template, before you can override the
   parameter value specified in the stack set you must first use UpdateStackSet to update all stack instances with the updated template and parameter value specified in the
   stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter
   value using UpdateStackInstances.

  update-stack-instances-request - `com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest`

  returns: Result of the UpdateStackInstances operation returned by the service. - `com.amazonaws.services.cloudformation.model.UpdateStackInstancesResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.UpdateStackInstancesResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest update-stack-instances-request]
    (-> this (.updateStackInstances update-stack-instances-request))))

(defn validate-template
  "Validates a specified template. AWS CloudFormation first checks if the template is valid JSON. If it isn't, AWS
   CloudFormation checks if the template is valid YAML. If both these checks fail, AWS CloudFormation returns a
   template validation error.

  validate-template-request - The input for ValidateTemplate action. - `com.amazonaws.services.cloudformation.model.ValidateTemplateRequest`

  returns: Result of the ValidateTemplate operation returned by the service. - `com.amazonaws.services.cloudformation.model.ValidateTemplateResult`"
  (^com.amazonaws.services.cloudformation.model.ValidateTemplateResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ValidateTemplateRequest validate-template-request]
    (-> this (.validateTemplate validate-template-request))))

(defn describe-stacks
  "Returns the description for the specified stack; if no stack name was specified, then it returns the description
   for all the stacks created.



   If the stack does not exist, an AmazonCloudFormationException is returned.

  describe-stacks-request - The input for DescribeStacks action. - `com.amazonaws.services.cloudformation.model.DescribeStacksRequest`

  returns: Result of the DescribeStacks operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStacksResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStacksResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStacksRequest describe-stacks-request]
    (-> this (.describeStacks describe-stacks-request)))
  (^com.amazonaws.services.cloudformation.model.DescribeStacksResult [^AmazonCloudFormation this]
    (-> this (.describeStacks))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonCloudFormation this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-stack-resource
  "Returns a description of the specified resource in the specified stack.


   For deleted stacks, DescribeStackResource returns resource information for up to 90 days after the stack has been
   deleted.

  describe-stack-resource-request - The input for DescribeStackResource action. - `com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest`

  returns: Result of the DescribeStackResource operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackResourceResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackResourceResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest describe-stack-resource-request]
    (-> this (.describeStackResource describe-stack-resource-request))))

(defn waiters
  "returns: `com.amazonaws.services.cloudformation.waiters.AmazonCloudFormationWaiters`"
  (^com.amazonaws.services.cloudformation.waiters.AmazonCloudFormationWaiters [^AmazonCloudFormation this]
    (-> this (.waiters))))

(defn get-stack-policy
  "Returns the stack policy for a specified stack. If a stack doesn't have a policy, a null value is returned.

  get-stack-policy-request - The input for the GetStackPolicy action. - `com.amazonaws.services.cloudformation.model.GetStackPolicyRequest`

  returns: Result of the GetStackPolicy operation returned by the service. - `com.amazonaws.services.cloudformation.model.GetStackPolicyResult`"
  (^com.amazonaws.services.cloudformation.model.GetStackPolicyResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.GetStackPolicyRequest get-stack-policy-request]
    (-> this (.getStackPolicy get-stack-policy-request))))

(defn update-stack
  "Updates a stack as specified in the template. After the call completes successfully, the stack update starts. You
   can check the status of the stack via the DescribeStacks action.


   To get a copy of the template for an existing stack, you can use the GetTemplate action.


   For more information about creating an update template, updating a stack, and monitoring the progress of the
   update, see Updating a
   Stack.

  update-stack-request - The input for an UpdateStack action. - `com.amazonaws.services.cloudformation.model.UpdateStackRequest`

  returns: Result of the UpdateStack operation returned by the service. - `com.amazonaws.services.cloudformation.model.UpdateStackResult`

  throws: com.amazonaws.services.cloudformation.model.InsufficientCapabilitiesException - The template contains resources with capabilities that weren't specified in the Capabilities parameter."
  (^com.amazonaws.services.cloudformation.model.UpdateStackResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.UpdateStackRequest update-stack-request]
    (-> this (.updateStack update-stack-request))))

(defn create-stack-set
  "Creates a stack set.

  create-stack-set-request - `com.amazonaws.services.cloudformation.model.CreateStackSetRequest`

  returns: Result of the CreateStackSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.CreateStackSetResult`

  throws: com.amazonaws.services.cloudformation.model.NameAlreadyExistsException - The specified name is already in use."
  (^com.amazonaws.services.cloudformation.model.CreateStackSetResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.CreateStackSetRequest create-stack-set-request]
    (-> this (.createStackSet create-stack-set-request))))

(defn execute-change-set
  "Updates a stack using the input information that was provided when the specified change set was created. After
   the call successfully completes, AWS CloudFormation starts updating the stack. Use the DescribeStacks
   action to view the status of the update.


   When you execute a change set, AWS CloudFormation deletes all other change sets associated with the stack because
   they aren't valid for the updated stack.


   If a stack policy is associated with the stack, AWS CloudFormation enforces the policy during the update. You
   can't specify a temporary stack policy that overrides the current policy.

  execute-change-set-request - The input for the ExecuteChangeSet action. - `com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest`

  returns: Result of the ExecuteChangeSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.ExecuteChangeSetResult`

  throws: com.amazonaws.services.cloudformation.model.InvalidChangeSetStatusException - The specified change set can't be used to update the stack. For example, the change set status might be CREATE_IN_PROGRESS, or the stack status might be UPDATE_IN_PROGRESS."
  (^com.amazonaws.services.cloudformation.model.ExecuteChangeSetResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest execute-change-set-request]
    (-> this (.executeChangeSet execute-change-set-request))))

(defn delete-stack-instances
  "Deletes stack instances for the specified accounts, in the specified regions.

  delete-stack-instances-request - `com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest`

  returns: Result of the DeleteStackInstances operation returned by the service. - `com.amazonaws.services.cloudformation.model.DeleteStackInstancesResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.DeleteStackInstancesResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest delete-stack-instances-request]
    (-> this (.deleteStackInstances delete-stack-instances-request))))

(defn update-termination-protection
  "Updates termination protection for the specified stack. If a user attempts to delete a stack with termination
   protection enabled, the operation fails and the stack remains unchanged. For more information, see Protecting a Stack From Being Deleted
   in the AWS CloudFormation User Guide.


   For nested stacks, termination
   protection is set on the root stack and cannot be changed directly on the nested stack.

  update-termination-protection-request - `com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest`

  returns: Result of the UpdateTerminationProtection operation returned by the service. - `com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionResult`"
  (^com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest update-termination-protection-request]
    (-> this (.updateTerminationProtection update-termination-protection-request))))

(defn list-stack-set-operations
  "Returns summary information about operations performed on a stack set.

  list-stack-set-operations-request - `com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest`

  returns: Result of the ListStackSetOperations operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackSetOperationsResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.ListStackSetOperationsResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest list-stack-set-operations-request]
    (-> this (.listStackSetOperations list-stack-set-operations-request))))

(defn list-stack-instances
  "Returns summary information about stack instances that are associated with the specified stack set. You can
   filter for stack instances that are associated with a specific AWS account name or region.

  list-stack-instances-request - `com.amazonaws.services.cloudformation.model.ListStackInstancesRequest`

  returns: Result of the ListStackInstances operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackInstancesResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.ListStackInstancesResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListStackInstancesRequest list-stack-instances-request]
    (-> this (.listStackInstances list-stack-instances-request))))

(defn list-imports
  "Lists all stacks that are importing an exported output value. To modify or remove an exported output value, first
   use this action to see which stacks are using it. To see the exported output values in your account, see
   ListExports.


   For more information about importing an exported output value, see the
   Fn::ImportValue  function.

  list-imports-request - `com.amazonaws.services.cloudformation.model.ListImportsRequest`

  returns: Result of the ListImports operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListImportsResult`"
  (^com.amazonaws.services.cloudformation.model.ListImportsResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListImportsRequest list-imports-request]
    (-> this (.listImports list-imports-request))))

(defn delete-change-set
  "Deletes the specified change set. Deleting change sets ensures that no one executes the wrong change set.


   If the call successfully completes, AWS CloudFormation successfully deleted the change set.

  delete-change-set-request - The input for the DeleteChangeSet action. - `com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest`

  returns: Result of the DeleteChangeSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.DeleteChangeSetResult`

  throws: com.amazonaws.services.cloudformation.model.InvalidChangeSetStatusException - The specified change set can't be used to update the stack. For example, the change set status might be CREATE_IN_PROGRESS, or the stack status might be UPDATE_IN_PROGRESS."
  (^com.amazonaws.services.cloudformation.model.DeleteChangeSetResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest delete-change-set-request]
    (-> this (.deleteChangeSet delete-change-set-request))))

(defn signal-resource
  "Sends a signal to the specified resource with a success or failure status. You can use the SignalResource API in
   conjunction with a creation policy or update policy. AWS CloudFormation doesn't proceed with a stack creation or
   update until resources receive the required number of signals or the timeout period is exceeded. The
   SignalResource API is useful in cases where you want to send signals from anywhere other than an Amazon EC2
   instance.

  signal-resource-request - The input for the SignalResource action. - `com.amazonaws.services.cloudformation.model.SignalResourceRequest`

  returns: Result of the SignalResource operation returned by the service. - `com.amazonaws.services.cloudformation.model.SignalResourceResult`"
  (^com.amazonaws.services.cloudformation.model.SignalResourceResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.SignalResourceRequest signal-resource-request]
    (-> this (.signalResource signal-resource-request))))

(defn set-stack-policy
  "Sets a stack policy for a specified stack.

  set-stack-policy-request - The input for the SetStackPolicy action. - `com.amazonaws.services.cloudformation.model.SetStackPolicyRequest`

  returns: Result of the SetStackPolicy operation returned by the service. - `com.amazonaws.services.cloudformation.model.SetStackPolicyResult`"
  (^com.amazonaws.services.cloudformation.model.SetStackPolicyResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.SetStackPolicyRequest set-stack-policy-request]
    (-> this (.setStackPolicy set-stack-policy-request))))

(defn list-stack-resources
  "Returns descriptions of all resources of the specified stack.


   For deleted stacks, ListStackResources returns resource information for up to 90 days after the stack has been
   deleted.

  list-stack-resources-request - The input for the ListStackResource action. - `com.amazonaws.services.cloudformation.model.ListStackResourcesRequest`

  returns: Result of the ListStackResources operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackResourcesResult`"
  (^com.amazonaws.services.cloudformation.model.ListStackResourcesResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListStackResourcesRequest list-stack-resources-request]
    (-> this (.listStackResources list-stack-resources-request))))

(defn create-stack-instances
  "Creates stack instances for the specified accounts, within the specified regions. A stack instance refers to a
   stack in a specific account and region. Accounts and Regions are required
   parameters—you must specify at least one account and one region.

  create-stack-instances-request - `com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest`

  returns: Result of the CreateStackInstances operation returned by the service. - `com.amazonaws.services.cloudformation.model.CreateStackInstancesResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.CreateStackInstancesResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest create-stack-instances-request]
    (-> this (.createStackInstances create-stack-instances-request))))

(defn create-stack
  "Creates a stack as specified in the template. After the call completes successfully, the stack creation starts.
   You can check the status of the stack via the DescribeStacks API.

  create-stack-request - The input for CreateStack action. - `com.amazonaws.services.cloudformation.model.CreateStackRequest`

  returns: Result of the CreateStack operation returned by the service. - `com.amazonaws.services.cloudformation.model.CreateStackResult`

  throws: com.amazonaws.services.cloudformation.model.LimitExceededException - The quota for the resource has already been reached. For information on resource and stack limitations, see Limits in the AWS CloudFormation User Guide."
  (^com.amazonaws.services.cloudformation.model.CreateStackResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.CreateStackRequest create-stack-request]
    (-> this (.createStack create-stack-request))))

(defn list-stacks
  "Returns the summary information for stacks whose status matches the specified StackStatusFilter. Summary
   information for stacks that have been deleted is kept for 90 days after the stack is deleted. If no
   StackStatusFilter is specified, summary information for all stacks is returned (including existing stacks and
   stacks that have been deleted).

  list-stacks-request - The input for ListStacks action. - `com.amazonaws.services.cloudformation.model.ListStacksRequest`

  returns: Result of the ListStacks operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStacksResult`"
  (^com.amazonaws.services.cloudformation.model.ListStacksResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListStacksRequest list-stacks-request]
    (-> this (.listStacks list-stacks-request)))
  (^com.amazonaws.services.cloudformation.model.ListStacksResult [^AmazonCloudFormation this]
    (-> this (.listStacks))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonCloudFormation this]
    (-> this (.shutdown))))

(defn describe-stack-resource-drifts
  "Returns drift information for the resources that have been checked for drift in the specified stack. This
   includes actual and expected configuration values for resources where AWS CloudFormation detects configuration
   drift.


   For a given stack, there will be one StackResourceDrift for each stack resource that has been
   checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not
   currently support drift detection are not checked, and so not included. For a list of resources that support
   drift detection, see Resources that Support Drift Detection.


   Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect
   drift on all supported resources for a given stack.

  describe-stack-resource-drifts-request - `com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsRequest`

  returns: Result of the DescribeStackResourceDrifts operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsRequest describe-stack-resource-drifts-request]
    (-> this (.describeStackResourceDrifts describe-stack-resource-drifts-request))))

(defn list-change-sets
  "Returns the ID and status of each active change set for a stack. For example, AWS CloudFormation lists change
   sets that are in the CREATE_IN_PROGRESS or CREATE_PENDING state.

  list-change-sets-request - The input for the ListChangeSets action. - `com.amazonaws.services.cloudformation.model.ListChangeSetsRequest`

  returns: Result of the ListChangeSets operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListChangeSetsResult`"
  (^com.amazonaws.services.cloudformation.model.ListChangeSetsResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListChangeSetsRequest list-change-sets-request]
    (-> this (.listChangeSets list-change-sets-request))))

(defn describe-account-limits
  "Retrieves your account's AWS CloudFormation limits, such as the maximum number of stacks that you can create in
   your account. For more information about account limits, see AWS
   CloudFormation Limits in the AWS CloudFormation User Guide.

  describe-account-limits-request - The input for the DescribeAccountLimits action. - `com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest`

  returns: Result of the DescribeAccountLimits operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeAccountLimitsResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeAccountLimitsResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest describe-account-limits-request]
    (-> this (.describeAccountLimits describe-account-limits-request))))

(defn stop-stack-set-operation
  "Stops an in-progress operation on a stack set and its associated stack instances.

  stop-stack-set-operation-request - `com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest`

  returns: Result of the StopStackSetOperation operation returned by the service. - `com.amazonaws.services.cloudformation.model.StopStackSetOperationResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.StopStackSetOperationResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest stop-stack-set-operation-request]
    (-> this (.stopStackSetOperation stop-stack-set-operation-request))))

(defn delete-stack
  "Deletes a specified stack. Once the call completes successfully, stack deletion starts. Deleted stacks do not
   show up in the DescribeStacks API if the deletion has been completed successfully.

  delete-stack-request - The input for DeleteStack action. - `com.amazonaws.services.cloudformation.model.DeleteStackRequest`

  returns: Result of the DeleteStack operation returned by the service. - `com.amazonaws.services.cloudformation.model.DeleteStackResult`

  throws: com.amazonaws.services.cloudformation.model.TokenAlreadyExistsException - A client request token already exists."
  (^com.amazonaws.services.cloudformation.model.DeleteStackResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DeleteStackRequest delete-stack-request]
    (-> this (.deleteStack delete-stack-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"cloudformation.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://cloudformation.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonCloudFormation this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-template
  "Returns the template body for a specified stack. You can get the template for running or deleted stacks.


   For deleted stacks, GetTemplate returns the template for up to 90 days after the stack has been deleted.



   If the template does not exist, a ValidationError is returned.

  get-template-request - The input for a GetTemplate action. - `com.amazonaws.services.cloudformation.model.GetTemplateRequest`

  returns: Result of the GetTemplate operation returned by the service. - `com.amazonaws.services.cloudformation.model.GetTemplateResult`

  throws: com.amazonaws.services.cloudformation.model.ChangeSetNotFoundException - The specified change set name or ID doesn't exit. To view valid change sets for a stack, use the ListChangeSets action."
  (^com.amazonaws.services.cloudformation.model.GetTemplateResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.GetTemplateRequest get-template-request]
    (-> this (.getTemplate get-template-request))))

(defn describe-stack-resources
  "Returns AWS resource descriptions for running and deleted stacks. If StackName is specified, all the
   associated resources that are part of the stack are returned. If PhysicalResourceId is specified,
   the associated resources of the stack that the resource belongs to are returned.



   Only the first 100 resources will be returned. If your stack has more resources than this, you should use
   ListStackResources instead.



   For deleted stacks, DescribeStackResources returns resource information for up to 90 days after the
   stack has been deleted.


   You must specify either StackName or PhysicalResourceId, but not both. In addition, you
   can specify LogicalResourceId to filter the returned result. For more information about resources,
   the LogicalResourceId and PhysicalResourceId, go to the AWS CloudFormation User Guide.



   A ValidationError is returned if you specify both StackName and
   PhysicalResourceId in the same request.

  describe-stack-resources-request - The input for DescribeStackResources action. - `com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest`

  returns: Result of the DescribeStackResources operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackResourcesResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackResourcesResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest describe-stack-resources-request]
    (-> this (.describeStackResources describe-stack-resources-request))))

(defn describe-stack-set-operation
  "Returns the description of the specified stack set operation.

  describe-stack-set-operation-request - `com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest`

  returns: Result of the DescribeStackSetOperation operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackSetOperationResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.DescribeStackSetOperationResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest describe-stack-set-operation-request]
    (-> this (.describeStackSetOperation describe-stack-set-operation-request))))

(defn list-stack-set-operation-results
  "Returns summary information about the results of a stack set operation.

  list-stack-set-operation-results-request - `com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest`

  returns: Result of the ListStackSetOperationResults operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest list-stack-set-operation-results-request]
    (-> this (.listStackSetOperationResults list-stack-set-operation-results-request))))

(defn describe-stack-events
  "Returns all stack related events for a specified stack in reverse chronological order. For more information about
   a stack's event history, go to Stacks in the AWS
   CloudFormation User Guide.



   You can list events for stacks that have failed to create or have been deleted by specifying the unique stack
   identifier (stack ID).

  describe-stack-events-request - The input for DescribeStackEvents action. - `com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest`

  returns: Result of the DescribeStackEvents operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackEventsResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackEventsResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest describe-stack-events-request]
    (-> this (.describeStackEvents describe-stack-events-request))))

(defn estimate-template-cost
  "Returns the estimated monthly cost of a template. The return value is an AWS Simple Monthly Calculator URL with a
   query string that describes the resources required to run the template.

  estimate-template-cost-request - The input for an EstimateTemplateCost action. - `com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest`

  returns: Result of the EstimateTemplateCost operation returned by the service. - `com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult`"
  (^com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest estimate-template-cost-request]
    (-> this (.estimateTemplateCost estimate-template-cost-request)))
  (^com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult [^AmazonCloudFormation this]
    (-> this (.estimateTemplateCost))))

(defn describe-stack-set
  "Returns the description of the specified stack set.

  describe-stack-set-request - `com.amazonaws.services.cloudformation.model.DescribeStackSetRequest`

  returns: Result of the DescribeStackSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackSetResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.DescribeStackSetResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackSetRequest describe-stack-set-request]
    (-> this (.describeStackSet describe-stack-set-request))))

(defn continue-update-rollback
  "For a specified stack that is in the UPDATE_ROLLBACK_FAILED state, continues rolling it back to the
   UPDATE_ROLLBACK_COMPLETE state. Depending on the cause of the failure, you can manually  fix the error and continue the rollback. By continuing the rollback, you can return your stack to a working
   state (the UPDATE_ROLLBACK_COMPLETE state), and then try to update the stack again.


   A stack goes into the UPDATE_ROLLBACK_FAILED state when AWS CloudFormation cannot roll back all
   changes after a failed stack update. For example, you might have a stack that is rolling back to an old database
   instance that was deleted outside of AWS CloudFormation. Because AWS CloudFormation doesn't know the database was
   deleted, it assumes that the database instance still exists and attempts to roll back to it, causing the update
   rollback to fail.

  continue-update-rollback-request - The input for the ContinueUpdateRollback action. - `com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest`

  returns: Result of the ContinueUpdateRollback operation returned by the service. - `com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackResult`

  throws: com.amazonaws.services.cloudformation.model.TokenAlreadyExistsException - A client request token already exists."
  (^com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest continue-update-rollback-request]
    (-> this (.continueUpdateRollback continue-update-rollback-request))))

(defn get-template-summary
  "Returns information about a new or existing template. The GetTemplateSummary action is useful for
   viewing parameter information, such as default parameter values and parameter types, before you create or update
   a stack or stack set.


   You can use the GetTemplateSummary action when you submit a template, or you can get template
   information for a stack set, or a running or deleted stack.


   For deleted stacks, GetTemplateSummary returns the template information for up to 90 days after the
   stack has been deleted. If the template does not exist, a ValidationError is returned.

  get-template-summary-request - The input for the GetTemplateSummary action. - `com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest`

  returns: Result of the GetTemplateSummary operation returned by the service. - `com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest get-template-summary-request]
    (-> this (.getTemplateSummary get-template-summary-request)))
  (^com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult [^AmazonCloudFormation this]
    (-> this (.getTemplateSummary))))

(defn list-exports
  "Lists all exported output values in the account and region in which you call this action. Use this action to see
   the exported output values that you can import into other stacks. To import values, use the
   Fn::ImportValue  function.


   For more information, see  AWS
   CloudFormation Export Stack Output Values.

  list-exports-request - `com.amazonaws.services.cloudformation.model.ListExportsRequest`

  returns: Result of the ListExports operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListExportsResult`"
  (^com.amazonaws.services.cloudformation.model.ListExportsResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListExportsRequest list-exports-request]
    (-> this (.listExports list-exports-request))))

(defn cancel-update-stack
  "Cancels an update on the specified stack. If the call completes successfully, the stack rolls back the update and
   reverts to the previous stack configuration.



   You can cancel only stacks that are in the UPDATE_IN_PROGRESS state.

  cancel-update-stack-request - The input for the CancelUpdateStack action. - `com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest`

  returns: Result of the CancelUpdateStack operation returned by the service. - `com.amazonaws.services.cloudformation.model.CancelUpdateStackResult`

  throws: com.amazonaws.services.cloudformation.model.TokenAlreadyExistsException - A client request token already exists."
  (^com.amazonaws.services.cloudformation.model.CancelUpdateStackResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest cancel-update-stack-request]
    (-> this (.cancelUpdateStack cancel-update-stack-request))))

(defn update-stack-set
  "Updates the stack set, and associated stack instances in the specified accounts and regions.


   Even if the stack set operation created by updating the stack set fails (completely or partially, below or above
   a specified failure tolerance), the stack set is updated with your changes. Subsequent
   CreateStackInstances calls on the specified stack set use the updated stack set.

  update-stack-set-request - `com.amazonaws.services.cloudformation.model.UpdateStackSetRequest`

  returns: Result of the UpdateStackSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.UpdateStackSetResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.UpdateStackSetResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.UpdateStackSetRequest update-stack-set-request]
    (-> this (.updateStackSet update-stack-set-request))))

(defn describe-change-set
  "Returns the inputs for the change set and a list of changes that AWS CloudFormation will make if you execute the
   change set. For more information, see Updating Stacks Using Change Sets in the AWS CloudFormation User Guide.

  describe-change-set-request - The input for the DescribeChangeSet action. - `com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest`

  returns: Result of the DescribeChangeSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeChangeSetResult`

  throws: com.amazonaws.services.cloudformation.model.ChangeSetNotFoundException - The specified change set name or ID doesn't exit. To view valid change sets for a stack, use the ListChangeSets action."
  (^com.amazonaws.services.cloudformation.model.DescribeChangeSetResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest describe-change-set-request]
    (-> this (.describeChangeSet describe-change-set-request))))

(defn list-stack-sets
  "Returns summary information about stack sets that are associated with the user.

  list-stack-sets-request - `com.amazonaws.services.cloudformation.model.ListStackSetsRequest`

  returns: Result of the ListStackSets operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackSetsResult`"
  (^com.amazonaws.services.cloudformation.model.ListStackSetsResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListStackSetsRequest list-stack-sets-request]
    (-> this (.listStackSets list-stack-sets-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCloudFormation this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-change-set
  "Creates a list of changes that will be applied to a stack so that you can review the changes before executing
   them. You can create a change set for a stack that doesn't exist or an existing stack. If you create a change set
   for a stack that doesn't exist, the change set shows all of the resources that AWS CloudFormation will create. If
   you create a change set for an existing stack, AWS CloudFormation compares the stack's information with the
   information that you submit in the change set and lists the differences. Use change sets to understand which
   resources AWS CloudFormation will create or change, and how it will change resources in an existing stack, before
   you create or update a stack.


   To create a change set for a stack that doesn't exist, for the ChangeSetType parameter, specify
   CREATE. To create a change set for an existing stack, specify UPDATE for the
   ChangeSetType parameter. After the CreateChangeSet call successfully completes, AWS
   CloudFormation starts creating the change set. To check the status of the change set or to review it, use the
   DescribeChangeSet action.


   When you are satisfied with the changes the change set will make, execute the change set by using the
   ExecuteChangeSet action. AWS CloudFormation doesn't make changes until you execute the change set.

  create-change-set-request - The input for the CreateChangeSet action. - `com.amazonaws.services.cloudformation.model.CreateChangeSetRequest`

  returns: Result of the CreateChangeSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.CreateChangeSetResult`

  throws: com.amazonaws.services.cloudformation.model.AlreadyExistsException - The resource with the name requested already exists."
  (^com.amazonaws.services.cloudformation.model.CreateChangeSetResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.CreateChangeSetRequest create-change-set-request]
    (-> this (.createChangeSet create-change-set-request))))

(defn describe-stack-instance
  "Returns the stack instance that's associated with the specified stack set, AWS account, and region.


   For a list of stack instances that are associated with a specific stack set, use ListStackInstances.

  describe-stack-instance-request - `com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest`

  returns: Result of the DescribeStackInstance operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackInstanceResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotFoundException - The specified stack set doesn't exist."
  (^com.amazonaws.services.cloudformation.model.DescribeStackInstanceResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest describe-stack-instance-request]
    (-> this (.describeStackInstance describe-stack-instance-request))))

(defn delete-stack-set
  "Deletes a stack set. Before you can delete a stack set, all of its member stack instances must be deleted. For
   more information about how to do this, see DeleteStackInstances.

  delete-stack-set-request - `com.amazonaws.services.cloudformation.model.DeleteStackSetRequest`

  returns: Result of the DeleteStackSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.DeleteStackSetResult`

  throws: com.amazonaws.services.cloudformation.model.StackSetNotEmptyException - You can't yet delete this stack set, because it still contains one or more stack instances. Delete all stack instances from the stack set before deleting the stack set."
  (^com.amazonaws.services.cloudformation.model.DeleteStackSetResult [^AmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DeleteStackSetRequest delete-stack-set-request]
    (-> this (.deleteStackSet delete-stack-set-request))))

