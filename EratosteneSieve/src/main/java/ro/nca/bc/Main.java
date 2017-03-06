package ro.nca.bc;

public class Main {

    public static void main(String[] args) {
	int n = 1000000;

	EratosthenesSieve1 sieve1 = new EratosthenesSieve1();
	sieve1.sieveOfEratosthenes(n);

	EratosthenesSieve2 sieve2 = new EratosthenesSieve2(n);
	sieve2.computePrimes();
	System.out.println(sieve2.getPrimesAsString());

    }
}
