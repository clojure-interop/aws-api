(ns com.amazonaws.services.managedblockchain.AbstractAmazonManagedBlockchain
  "Abstract implementation of AmazonManagedBlockchain. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.managedblockchain AbstractAmazonManagedBlockchain]))

(defn create-network
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.CreateNetworkRequest`

  returns: Result of the CreateNetwork operation returned by the service. - `com.amazonaws.services.managedblockchain.model.CreateNetworkResult`"
  (^com.amazonaws.services.managedblockchain.model.CreateNetworkResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.CreateNetworkRequest request]
    (-> this (.createNetwork request))))

(defn list-networks
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.ListNetworksRequest`

  returns: Result of the ListNetworks operation returned by the service. - `com.amazonaws.services.managedblockchain.model.ListNetworksResult`"
  (^com.amazonaws.services.managedblockchain.model.ListNetworksResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.ListNetworksRequest request]
    (-> this (.listNetworks request))))

(defn create-proposal
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.CreateProposalRequest`

  returns: Result of the CreateProposal operation returned by the service. - `com.amazonaws.services.managedblockchain.model.CreateProposalResult`"
  (^com.amazonaws.services.managedblockchain.model.CreateProposalResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.CreateProposalRequest request]
    (-> this (.createProposal request))))

(defn delete-node
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.DeleteNodeRequest`

  returns: Result of the DeleteNode operation returned by the service. - `com.amazonaws.services.managedblockchain.model.DeleteNodeResult`"
  (^com.amazonaws.services.managedblockchain.model.DeleteNodeResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.DeleteNodeRequest request]
    (-> this (.deleteNode request))))

(defn get-node
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.GetNodeRequest`

  returns: Result of the GetNode operation returned by the service. - `com.amazonaws.services.managedblockchain.model.GetNodeResult`"
  (^com.amazonaws.services.managedblockchain.model.GetNodeResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.GetNodeRequest request]
    (-> this (.getNode request))))

(defn list-proposal-votes
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.ListProposalVotesRequest`

  returns: Result of the ListProposalVotes operation returned by the service. - `com.amazonaws.services.managedblockchain.model.ListProposalVotesResult`"
  (^com.amazonaws.services.managedblockchain.model.ListProposalVotesResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.ListProposalVotesRequest request]
    (-> this (.listProposalVotes request))))

(defn list-nodes
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.ListNodesRequest`

  returns: Result of the ListNodes operation returned by the service. - `com.amazonaws.services.managedblockchain.model.ListNodesResult`"
  (^com.amazonaws.services.managedblockchain.model.ListNodesResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.ListNodesRequest request]
    (-> this (.listNodes request))))

(defn shutdown
  "Description copied from interface: AmazonManagedBlockchain"
  ([^AbstractAmazonManagedBlockchain this]
    (-> this (.shutdown))))

(defn list-proposals
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.ListProposalsRequest`

  returns: Result of the ListProposals operation returned by the service. - `com.amazonaws.services.managedblockchain.model.ListProposalsResult`"
  (^com.amazonaws.services.managedblockchain.model.ListProposalsResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.ListProposalsRequest request]
    (-> this (.listProposals request))))

(defn reject-invitation
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.RejectInvitationRequest`

  returns: Result of the RejectInvitation operation returned by the service. - `com.amazonaws.services.managedblockchain.model.RejectInvitationResult`"
  (^com.amazonaws.services.managedblockchain.model.RejectInvitationResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.RejectInvitationRequest request]
    (-> this (.rejectInvitation request))))

(defn create-member
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.CreateMemberRequest`

  returns: Result of the CreateMember operation returned by the service. - `com.amazonaws.services.managedblockchain.model.CreateMemberResult`"
  (^com.amazonaws.services.managedblockchain.model.CreateMemberResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.CreateMemberRequest request]
    (-> this (.createMember request))))

(defn list-members
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.ListMembersRequest`

  returns: Result of the ListMembers operation returned by the service. - `com.amazonaws.services.managedblockchain.model.ListMembersResult`"
  (^com.amazonaws.services.managedblockchain.model.ListMembersResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.ListMembersRequest request]
    (-> this (.listMembers request))))

(defn create-node
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.CreateNodeRequest`

  returns: Result of the CreateNode operation returned by the service. - `com.amazonaws.services.managedblockchain.model.CreateNodeResult`"
  (^com.amazonaws.services.managedblockchain.model.CreateNodeResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.CreateNodeRequest request]
    (-> this (.createNode request))))

(defn delete-member
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.DeleteMemberRequest`

  returns: Result of the DeleteMember operation returned by the service. - `com.amazonaws.services.managedblockchain.model.DeleteMemberResult`"
  (^com.amazonaws.services.managedblockchain.model.DeleteMemberResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.DeleteMemberRequest request]
    (-> this (.deleteMember request))))

(defn vote-on-proposal
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.VoteOnProposalRequest`

  returns: Result of the VoteOnProposal operation returned by the service. - `com.amazonaws.services.managedblockchain.model.VoteOnProposalResult`"
  (^com.amazonaws.services.managedblockchain.model.VoteOnProposalResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.VoteOnProposalRequest request]
    (-> this (.voteOnProposal request))))

(defn get-network
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.GetNetworkRequest`

  returns: Result of the GetNetwork operation returned by the service. - `com.amazonaws.services.managedblockchain.model.GetNetworkResult`"
  (^com.amazonaws.services.managedblockchain.model.GetNetworkResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.GetNetworkRequest request]
    (-> this (.getNetwork request))))

(defn get-proposal
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.GetProposalRequest`

  returns: Result of the GetProposal operation returned by the service. - `com.amazonaws.services.managedblockchain.model.GetProposalResult`"
  (^com.amazonaws.services.managedblockchain.model.GetProposalResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.GetProposalRequest request]
    (-> this (.getProposal request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonManagedBlockchain

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonManagedBlockchain this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-invitations
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.ListInvitationsRequest`

  returns: Result of the ListInvitations operation returned by the service. - `com.amazonaws.services.managedblockchain.model.ListInvitationsResult`"
  (^com.amazonaws.services.managedblockchain.model.ListInvitationsResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.ListInvitationsRequest request]
    (-> this (.listInvitations request))))

(defn get-member
  "Description copied from interface: AmazonManagedBlockchain

  request - `com.amazonaws.services.managedblockchain.model.GetMemberRequest`

  returns: Result of the GetMember operation returned by the service. - `com.amazonaws.services.managedblockchain.model.GetMemberResult`"
  (^com.amazonaws.services.managedblockchain.model.GetMemberResult [^AbstractAmazonManagedBlockchain this ^com.amazonaws.services.managedblockchain.model.GetMemberRequest request]
    (-> this (.getMember request))))

