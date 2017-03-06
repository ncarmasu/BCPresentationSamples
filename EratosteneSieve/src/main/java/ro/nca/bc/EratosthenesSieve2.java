package ro.nca.bc;

public class EratosthenesSieve2 {

    private int       n;
    private boolean[] isPrime;

    public EratosthenesSieve2(int n) {
	this.n = n;
	this.isPrime = getAllTrueArrayOfSize(n);
    }

    public void computePrimes() {
	for (int candidate = 2; candidate * candidate <= n; candidate++) {
	    if (isPrime[candidate]) {
		markMultiplesAsBeingNotPrime(candidate);
	    }
	}
    }

    public String getPrimesAsString() {
	StringBuilder sb = new StringBuilder();
	for (int i = 2; i <= n; i++) {
	    if (isPrime[i]) {
		sb.append(i).append(" ");
	    }
	}
	return sb.toString();
    }

    private void markMultiplesAsBeingNotPrime(int p) {
	for (int primeMultiple = p * 2; primeMultiple <= n; primeMultiple += p) {
	    isPrime[primeMultiple] = false;
	}
    }

    private boolean[] getAllTrueArrayOfSize(int n) {
	boolean prime[] = new boolean[n + 1];
	for (int i = 0; i < n; i++) {
	    prime[i] = true;
	}
	return prime;
    }
}
